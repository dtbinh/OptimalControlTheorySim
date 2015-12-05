import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FoodProducerTest {

	FoodProducer foodie;
	Land land;
	@Before
	public void setUp() throws Exception {
		land = new Land(20);
		foodie = new FoodProducer(land);
		foodie.produce(20);
	}

	@Test
	public void testGetNumGoods() {
		assertEquals(20, foodie.getProducedGoods());
	}

	@Test
	public void testCalculateProfit() {
		foodie.sellGoods(10);
		foodie.calculateProfit();
		assertEquals(60,foodie.getProfit());
	}

	@Test
	public void testProduce() {
		assertEquals(20, foodie.getProducedGoods());
	}

	@Test
	public void testSellGoods(){
		foodie.sellGoods(10);
		assertEquals(10, foodie.getProducedGoods());
		assertEquals(10, foodie.getNumGoodsSold());
	}
}
