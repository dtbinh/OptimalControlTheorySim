import java.util.ArrayList;

public class Simulation {
	private ArrayList<Consumer> consumers;
	private FoodProducer foodCart;
	private WeaponProducer travelingMerchant;
	private Land land;
	private Wood wood;
	private int timePeriods;
	private int productionRate;
	
	public Simulation(int numConsumers, int timePeriods){
		consumers = new ArrayList<Consumer>();
		for(int i=0; i<numConsumers; i++){
			consumers.add(new Consumer());
		}
		land = new Land(numConsumers);
		wood = new Wood(numConsumers);
		foodCart = new FoodProducer(land);
		travelingMerchant = new WeaponProducer(wood, optimalControlLaw());
		this.timePeriods = timePeriods;
	}

	//returns amount of resource that should be consumed in time period
	//F(numConsumers, numResource, number of timePeriods
	public int optimalControlLaw(){
		
		return 0;
	}
	
	public void generateDollaDollaBills(){
		for(Consumer c: consumers){
			c.dollaDollaBillYall();
		}
	}
	
	public void produceGoods(){
		foodCart.produce();
		//travelingMerchant.produce();
	}
	
	public void letsGoShopping(){
		
	}
	
	public void heyYaWannaTrade(){
		
	}
	
	public void newGeneration(){
		
	}
	
	//everything below this comment is for testing purposes only
	public ArrayList<Consumer> getConsumers() {
		return consumers;
	}
	
	public int getNumConsumers(){
		return consumers.size();
	}

	public FoodProducer getFoodCart() {
		return foodCart;
	}
	
	public WeaponProducer getTravelingMerchant() {
		return travelingMerchant;
	}

}
