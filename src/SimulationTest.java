import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SimulationTest {
	Simulation sim;
	
	@Before
	public void setUp() throws Exception {
		sim = new Simulation(20, 5);
		sim.setCurrentTimePeriod(1);
	}

	@Test
	public void testOptimalControlLaw() {
		assertEquals(19933, sim.optimalControlLaw());
	}

	@Test
	public void testGetCurrentTimePeriod() {
		assertEquals(1, sim.getCurrentTimePeriod());
	}

	@Test
	public void testSetCurrentTimePeriod() {
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
		sim.produceGoods(sim.optimalControlLaw());
		assertEquals(67, sim.getWeaponMerchant().getProducedGoods());
	}

	@Test
	public void testLetsGoShopping() {
		sim.generateDollaDollaBills();
		sim.produceGoods(sim.optimalControlLaw());
		sim.letsGoShopping();
		ArrayList<Consumer> c = sim.getConsumers();
		assertTrue( c.get(3).getNumWeapons()> 0);
		assertTrue(sim.getWeaponMerchant().getNumGoodsSold()>0);
	}

	@Test
	public void testHeyYaWannaTrade() {
		fail("Not yet implemented");
	}

	@Test
	public void testNewGeneration() {
		for(Consumer c: sim.getConsumers()){
			c.setNumWeapons(4);
		}
		sim.newGeneration();
		assertEquals(40, sim.getConsumers().size());
	}

	@Test
	public void testGetConsumers() {
		for(Consumer c: sim.getConsumers()){
			assertNotNull(c);
		}
	}

	@Test
	public void testGetNumConsumers() {
		assertEquals(20, sim.getNumConsumers());
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
