
public class WeaponProducer implements Producer{
	
	private Resource resource;
	private int goods;
	private int numSold;
	private int price;
	private int profit;
	private int productionCosts;
	private int productionRate;
	
	public WeaponProducer(Resource resource, int productionRate){
		this.resource = resource;
		profit = 0;
		goods = 0;
		numSold = 0;
		this.productionRate = productionRate;
	}

	/**
	 * sets the rate at which resources are harvested and turned into weapons
	 */
	public void rateOfProduction(){
		
	}
	
	@Override
	public void produce() {
		// TODO Auto-generated method stub
	}

	@Override
	public int getNumGoods() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void calculateProfit() {
		profit += (price*goods) - (productionCosts*goods);
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		
	}

}
