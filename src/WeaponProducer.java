
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
	}

	/**
	 * produces amount of goods passed in, determined by the simulation
	 */
	@Override
	public void produce(int amountToProduce) {
		for (int i = 0; i < amountToProduce; i++) {
			producedGoods++;
		}
	}

	@Override
	public void sellGoods(int numSold) {
		numGoodsSold += numSold;
	}

}
