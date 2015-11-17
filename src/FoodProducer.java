
public class FoodProducer implements Producer{
	private Resource resource;
	private int goods;
	private int numSold;
	private int price;
	private int profit;
	
	public FoodProducer(Resource resource){
		this.resource=resource;
		profit = 0;
		numSold = 0;
		goods = 0;
	}
	
	@Override
	public int produce() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumGoods() {
		return goods;
	}

	@Override
	public void calculateProfit() {
		this.profit+=goods*price;
	}

}
