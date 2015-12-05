import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeaponProducerTest {

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
		assertEquals(10, weaponMerch.getProducedGoods());
	}

	@Test
	public void testCalculateProfit() {
		assertEquals(80, weaponMerch.getProfit());
	}

	@Test
	public void testGetResource() {
		assertNotNull(weaponMerch.getResource());
	}

	@Test
	public void testProduce() {
		assertEquals(10, weaponMerch.getProducedGoods());
	}

}
