
public class WeaponProducer implements Producer {

	private Resource resource;
	private int goods;
	private int numSold;
	private int price;
	private int profit;
	private int productionCosts;

	public WeaponProducer(Resource resource) {
		this.resource = resource;
		profit = 0;
		goods = 0;
		numSold = 0;
	}

	@Override
	public int getNumGoods() {
		return goods;
	}

	@Override
	public void calculateProfit() {
		profit += (price * goods) - (productionCosts * goods);
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub

	}

	public Resource getResource() {
		return resource;
	}

	@Override
	public void produce(int amountToProduce) {
		// TODO Auto-generated method stub

	}

}
