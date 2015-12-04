import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimulationTest {
	Simulation sim;
	
	@Before
	public void setUp() throws Exception {
		sim = new Simulation(20, 5);
	}

	@Test
	public void testOptimalControlLaw() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentTimePeriod() {
		assertEquals(0, sim.getCurrentTimePeriod());
	}

	@Test
	public void testSetCurrentTimePeriod() {
		sim.setCurrentTimePeriod(1);
		assertEquals(1, sim.getCurrentTimePeriod());
	}

	@Test
	public void testGenerateDollaDollaBills() {
		for(Consumer c: sim.getConsumers()){
			assertNotNull(c.getMoney());
		}
	}

	@Test
	public void testProduceGoods() {
		fail("Not yet implemented");
	}

	@Test
	public void testLetsGoShopping() {
		fail("Not yet implemented");
	}

	@Test
	public void testHeyYaWannaTrade() {
		fail("Not yet implemented");
	}

	@Test
	public void testNewGeneration() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetConsumers() {
		for(Consumer c: sim.getConsumers()){
			assertNotNull(c);
		}
	}

	@Test
	public void testGetNumConsumers() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFoodCart() {
		assertNotNull(sim.getFoodCart());
	}

	@Test
	public void testGetWeaponMerchant() {
		assertNotNull(sim.getWeaponMerchant());
	}

}
