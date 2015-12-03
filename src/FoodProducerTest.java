import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FoodProducerTest {
	private FoodProducer foodie;
	private Land land;
	@Before
	public void setUp() throws Exception {
		land = new Land(20);
		foodie = new FoodProducer(land);
	}

	@Test
	public void testProduce() {
		foodie.produce();
		assert(foodie.getNumGoods()>0);
	}

	@Test
	public void testGetNumGoods() {
		assertNotNull(foodie.getNumGoods());
	}

	@Test
	public void testCalculateProfit() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrice() {
		fail("Not yet implemented");
	}

}
