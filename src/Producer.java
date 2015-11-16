
public interface Producer<G> {
	int produce();//transforms resources into goods, returns number of goods
	int getNumGoods();//gets number of goods produced
	int setNumGoods();//sets number of goods produced
	int calculateProfit();//calculates profit made by producer in time period
}
