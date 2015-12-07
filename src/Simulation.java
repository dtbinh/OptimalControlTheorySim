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
	 * returns the end state of the resource owned by the producer in that time period
	 * 
	 * @return state
	 */
	public int optimalControlLaw() {
		int state;
		int temp;
		if (currentTimePeriod == 1) {
			state = (int) (10 * (numInitialConsumers * (Math.pow((double) -currentTimePeriod, 3.0) / 3))
					+ optimalConstant);
			previousState = state;
			return state;
		} else {
			state = (int) (numInitialConsumers * (Math.pow((double) -currentTimePeriod, 3.0) / 3) + optimalConstant);
			temp = state;
			state = previousState + state;
			previousState = temp;
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

	public void letsGoShopping() {
		for (Consumer c : consumers) {
			int potentialPurchase = 0;
			int lastWeapons;
			while (c.getMoney() > potentialPurchase * weaponMerchant.getPrice()) {
				potentialPurchase++;
			}
			if (weaponMerchant.getProducedGoods() - weaponMerchant.getNumGoodsSold() > potentialPurchase) {
				c.purchaseWeapons(potentialPurchase, weaponMerchant.getPrice());
				weaponMerchant.sellGoods(potentialPurchase);
			} else {
				lastWeapons = weaponMerchant.getProducedGoods() - weaponMerchant.getNumGoodsSold();
				c.purchaseWeapons(lastWeapons, weaponMerchant.getPrice());
				weaponMerchant.sellGoods(lastWeapons);
				return;
			}
		}
	}

	public void heyYaWannaTrade() {

	}

	/**
	 * generates the next generation of consumers, if they survive the realSurvivalRate vs random 0-1
	 * another consumer is produced, if they don't then that consumer is removed(aka dies)
	 */
	public void newGeneration() {
		Random rn = new Random();
		int newGeneration = 0;
		for (Iterator<Consumer> it = consumers.iterator(); it.hasNext();) {
			Consumer c = it.next();
			if (c.calculateRealSurvivalRate() > rn.nextDouble()) {
				newGeneration++;
			} else {
				it.remove();
			}
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
