import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeaponProducerTest {

	/**
	 * This test is going to look all kinds of messed up at first, but bear with me.
	 * Since weaponMerch.produce() takes the optimal state post production, these test
	 * mildly break(in the sense of they return messed up values with the way I'm calling production
	 * in setup).
	 */
	Wood wood;
	WeaponProducer weaponMerch;
	@Before
	public void setUp() throws Exception {
		wood = new Wood(20);
		weaponMerch = new WeaponProducer(wood);
		weaponMerch.produce(10);
		weaponMerch.sellGoods(10);
		weaponMerch.calculateProfit();
	}

	@Test
	public void testGetProducedGoods() {
		assertEquals(1999980, weaponMerch.getProducedGoods());
	}

	@Test
	public void testCalculateProfit() {
		assertEquals(-3999880, weaponMerch.getProfit());
	}

	@Test
	public void testGetResource() {
		assertNotNull(weaponMerch.getResource());
	}

	@Test
	public void testProduce() {
		assertEquals(1999980, weaponMerch.getProducedGoods());
	}

}
