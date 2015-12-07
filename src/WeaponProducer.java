
public class WeaponProducer implements Producer {

	private Resource resource;
	private int producedGoods;
	private int numGoodsSold;
	private int price;
	private int profit;
	private int productionCosts;

	public WeaponProducer(Resource resource) {
		this.resource = resource;
		profit = 0;
		producedGoods = 0;
		numGoodsSold = 0;
		price = 10;
		productionCosts = 2;
	}

	/**
	 * gets the number of goods sold in a time period so far
	 * 
	 * @return numGoodsSold
	 */
	public int getNumGoodsSold() {
		return numGoodsSold;
	}

	/**
	 * used to reset the number of goods sold at the start of a time period
	 * 
	 * @param numGoodsSold
	 */
	public void setNumGoodsSold(int numGoodsSold) {
		this.numGoodsSold = numGoodsSold;
	}

	/**
	 * returns the price of a weapon
	 * 
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * used to reset the produced goods to zero at the start of a new time
	 * period
	 * 
	 * @param producedGoods
	 */
	public void setProducedGoods(int producedGoods) {
		this.producedGoods = producedGoods;
	}

	/**
	 * gets number of goods produced in a time period
	 */
	@Override
	public int getProducedGoods() {
		return producedGoods;
	}

	/**
	 * gets total profit across time periods
	 * 
	 * @return profit
	 */
	public int getProfit() {
		return profit;
	}

	/**
	 * returns the resource owned by the producer
	 * 
	 * @return resource
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * adds profit from time period into total profit
	 */
	@Override
	public void calculateProfit() {
		profit += (price * numGoodsSold) - (productionCosts * producedGoods);
		producedGoods = producedGoods-numGoodsSold;
		numGoodsSold = 0;
	}

	/**
	 * produces amount of goods necessary to reduce resource down to the state passed in
	 * so basically produces the amount of goods for that time period based on law
	 */
	@Override
	public void produce(int amountToProduce) {
		int production = resource.getCurrentNumResources()-amountToProduce;
		for (int i = 0; i < production; i++) {
			producedGoods++;
			resource.setCurrentNumResources(resource.getCurrentNumResources()-1);
		}
	}

	/**
	 * sells goods
	 */
	@Override
	public void sellGoods(int numSold) {
		numGoodsSold += numSold;
	}

}
