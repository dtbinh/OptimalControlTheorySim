
public interface Producer {
	
	/**
	 * transforms resources into goods, returns number of goods
	 * @return
	 */
	int produce();
	
	/**
	 * gets number of goods produced
	 * @return
	 */
	int getNumGoods();
	
	/**
	 * calculates profit made by producer in time period
	 */
	void calculateProfit();
}
