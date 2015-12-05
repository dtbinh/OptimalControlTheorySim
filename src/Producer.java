
public interface Producer {

	/**
	 * transforms resources into goods, returns number of goods
	 * 
	 * @return
	 */
	void produce(int amountToProduce);

	/**
	 * gets number of goods produced
	 * 
	 * @return
	 */
	int getNumGoods();

	/**
	 * calculates profit made by producer in time period
	 */
	void calculateProfit();

	/**
	 * sell goods made by that producer in time period
	 */
	void sellGoods(int numSold);
}
