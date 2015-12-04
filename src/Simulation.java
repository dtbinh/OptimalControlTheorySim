import java.util.ArrayList;

public class Simulation {
	private ArrayList<Consumer> consumers;
	private FoodProducer foodCart;
	private WeaponProducer travelingMerchant;
	private Land land;
	private Wood wood;
	private int timePeriods;
	private int currentTimePeriod;
	private int optimalConstant;

	public Simulation(int numConsumers, int timePeriods) {
		consumers = new ArrayList<Consumer>();
		for (int i = 0; i < numConsumers; i++) {
			consumers.add(new Consumer());
		}
		land = new Land(numConsumers);
		wood = new Wood(numConsumers);
		foodCart = new FoodProducer(land);
		travelingMerchant = new WeaponProducer(wood);
		this.timePeriods = timePeriods;
		optimalConstant = travelingMerchant.getResource().getNumResources();
		currentTimePeriod = 0;
	}

	// returns the amount of the resource to gather in the current time period
	// call in main, then use that value to control produce
	public int optimalControlLaw() {
		return 0;
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

	public WeaponProducer getTravelingMerchant() {
		return travelingMerchant;
	}

}
