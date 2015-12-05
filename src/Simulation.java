import java.util.ArrayList;

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

	// returns amount of resource to gather/produce with in the current time
	// period
	public int optimalControlLaw() {
		int state;
		int temp;
		if (currentTimePeriod == 1) {
			state = (int) (10
					* (numInitialConsumers * (Math.pow((double) -currentTimePeriod, 3.0) / 3)) + optimalConstant);
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

	public int getCurrentTimePeriod() {
		return currentTimePeriod;
	}

	public void setCurrentTimePeriod(int currentTimePeriod) {
		this.currentTimePeriod = currentTimePeriod;
	}

	public void generateDollaDollaBills() {
		for (Consumer c : consumers) {
			c.dollaDollaBillYall();
		}
	}

	public void produceGoods() {

	}

	public void letsGoShopping() {

	}

	public void heyYaWannaTrade() {

	}

	public void newGeneration() {

	}

	// everything below this comment is for testing purposes only
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
