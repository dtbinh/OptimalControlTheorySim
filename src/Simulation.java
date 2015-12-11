import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Simulation {
	private ArrayList<Consumer> consumers;
	private int numInitialConsumers;
	private FoodProducer foodCart;
	private WeaponProducer weaponMerchant;
	private Land land;
	private Wood wood;
	private int timePeriods;
	private int currentTimePeriod;
	private int optimalConstant;
	private int previousState;

	public Simulation(int numConsumers, int timePeriods) {
		consumers = new ArrayList<Consumer>();
		for (int i = 0; i < numConsumers; i++) {
			consumers.add(new Consumer());
		}
		numInitialConsumers = numConsumers;
		land = new Land(numConsumers);
		wood = new Wood(numConsumers);
		foodCart = new FoodProducer(land);
		weaponMerchant = new WeaponProducer(wood);
		this.timePeriods = timePeriods;
		optimalConstant = weaponMerchant.getResource().getNumResources();
		currentTimePeriod = 0;
	}

	/**
	 * returns the end state of the resource owned by the producer in that time
	 * period
	 * 
	 * @return state
	 */
	public int optimalControlLaw() {
		int state;
		int temp;
		double rate;
		double numConsumTemp = numInitialConsumers;
		double optimalConstantTemp = optimalConstant;
		if (currentTimePeriod == 1) {
			rate = Math.pow((double) -currentTimePeriod, 3.0) / 3.0;
			state = (int) ((numConsumTemp * rate) + optimalConstantTemp);
			previousState = state;
			System.out.println("state post production: " + state);
			return state;
		} else {
			rate = Math.pow((double) -currentTimePeriod, 3.0) / 3.0;
			state = (int) ((numConsumTemp * rate) + optimalConstantTemp);
			if (state < 0) {
				state = weaponMerchant.getResource().getCurrentNumResources();
				previousState = 0;
				System.out.println("state post production: " + 0);
				return state;
			}
			previousState = state;
			System.out.println("state post production: " + state);
			return state;
		}
	}

	/**
	 * returns the currentTimePeriod
	 * 
	 * @return currentTimePeriod
	 */
	public int getCurrentTimePeriod() {
		return currentTimePeriod;
	}

	/**
	 * sets the currentTimePeriod
	 * 
	 * @param currentTimePeriod
	 */
	public void setCurrentTimePeriod(int currentTimePeriod) {
		this.currentTimePeriod = currentTimePeriod;
	}

	/**
	 * generates each consumers wallets for the time period
	 */
	public void generateDollaDollaBills() {
		for (Consumer c : consumers) {
			c.dollaDollaBillYall();
		}
	}

	/**
	 * tells each producer to produce
	 */
	public void produceGoods(int amountToProduce) {
		weaponMerchant.produce(amountToProduce);
	}

	/**
	 * consumers buy weapons, performing greedy purchases right now. Consumers
	 * will buy until they can't afford any more
	 */
	public void letsGoShopping() {
		for (Consumer c : consumers) {
			int potentialPurchase = 0;
			int lastWeapons;
			while (c.getMoney() > potentialPurchase * weaponMerchant.getPrice()
					&& potentialPurchase < weaponMerchant.getProducedGoods()) {
				potentialPurchase++;
			}
			if (weaponMerchant.getProducedGoods() - weaponMerchant.getNumGoodsSold() < potentialPurchase) {
				lastWeapons = weaponMerchant.getProducedGoods() - weaponMerchant.getNumGoodsSold();
				c.purchaseWeapons(lastWeapons, weaponMerchant.getPrice());
				weaponMerchant.sellGoods(lastWeapons);
				weaponMerchant.calculateProfit();
				return;
			} else {
				c.purchaseWeapons(potentialPurchase, weaponMerchant.getPrice());
				weaponMerchant.sellGoods(potentialPurchase);
			}
		}
		weaponMerchant.calculateProfit();
	}

	/**
	 * consumers trade between each other, so far only set for weapons
	 */
	public void heyYaWannaTrade() {
		ArrayList<Consumer> buyers = new ArrayList<Consumer>();
		ArrayList<Consumer> sellers = new ArrayList<Consumer>();
		for (Consumer c : consumers) {
			if (c.getNumWeapons() < 4) {
				buyers.add(c);
			} else if (c.getNumWeapons() > 4) {
				sellers.add(c);
			}
		}

		consumers.removeAll(buyers);
		consumers.removeAll(sellers);

		for (Consumer c : sellers) {
			for (Consumer f : buyers) {
				if (f.getNumWeapons() == 4 || f.getMoney() < 10) {
					break;
				}
				if (c.getNumWeapons() < 4) {
					break;
				} else {
					c.setNumWeapons(c.getNumWeapons() - 1);
					c.setMoney(c.getMoney() + 10);
					f.setNumWeapons(f.getNumWeapons() + 1);
					f.setMoney(f.getMoney() - 10);
				}

			}
		}
		consumers.addAll(buyers);
		consumers.addAll(sellers);
	}

	/**
	 * generates the next generation of consumers, if they survive the
	 * realSurvivalRate vs random 0-1 another consumer is produced, if they
	 * don't then that consumer is removed(aka dies) Also destroys weapons at
	 * the end of the time period
	 */
	public void newGeneration() {
		Random rn = new Random();
		double chance;
		int newGeneration = 0;
		for (Iterator<Consumer> it = consumers.iterator(); it.hasNext();) {
			Consumer c = it.next();
			chance = rn.nextDouble();
			if (c.calculateRealSurvivalRate() > chance) {
				newGeneration++;
			} else {
				it.remove();
			}
		}

		int broken;
		for (Consumer c : consumers) {
			broken = 0;
			for (int i = 0; i < c.getNumWeapons(); i++) {
				if (rn.nextDouble() > .5) {
					broken++;
				}
			}
			c.setNumWeapons(c.getNumWeapons() - broken);
		}

		for (int i = 0; i < newGeneration; i++) {
			consumers.add(new Consumer());
		}
	}

	public ArrayList<Consumer> getConsumers() {
		return consumers;
	}

	public int getNumConsumers() {
		return consumers.size();
	}

	public FoodProducer getFoodCart() {
		return foodCart;
	}

	public WeaponProducer getWeaponMerchant() {
		return weaponMerchant;
	}

}
