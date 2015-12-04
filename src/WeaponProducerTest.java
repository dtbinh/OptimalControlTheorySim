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
	}

	@Test
	public void testGetNumGoods() {
		assertEquals(0, weaponMerch.getNumGoods());
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
	public void testGetResource() {
		fail("Not yet implemented");
	}

	@Test
	public void testProduce() {
		fail("Not yet implemented");
	}

}
