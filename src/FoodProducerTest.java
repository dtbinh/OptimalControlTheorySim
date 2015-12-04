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
	}

	@Test
	public void testGetNumGoods() {
		assertEquals(0, foodie.getNumGoods());
	}

	@Test
	public void testCalculateProfit() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testProduce() {
		fail("Not yet implemented");
	}

}
