
public class WeaponProducer implements Producer {

	private Resource resource;
	private int goods;
	private int numGoodsSold;
	private int price;
	private int profit;
	private int productionCosts;

	public WeaponProducer(Resource resource) {
		this.resource = resource;
		profit = 0;
		goods = 0;
		numGoodsSold = 0;
		price = 10;
		productionCosts = 2;
	}

	@Override
	public int getNumGoods() {
		return goods;
	}

	public int getProfit() {
		return profit;
	}

	@Override
	public void calculateProfit() {
//		System.out.println(price * numGoodsSold);
//		System.out.println(productionCosts * goods);
		profit += (price * numGoodsSold) - (productionCosts * goods);
	}

	public Resource getResource() {
		return resource;
	}

	@Override
	public void produce(int amountToProduce) {
		for (int i = 0; i < amountToProduce; i++) {
			goods++;
		}
	}

	@Override
	public void sellGoods(int numSold) {
		numGoodsSold += numSold;
		System.out.println(numGoodsSold);
		goods -= numSold;
	}

}
