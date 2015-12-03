import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SimulationTest {
	private Simulation s;
	private int numConsumers;
	@Before
	public void setUp() throws Exception {
		numConsumers = 20;
		s = new Simulation(numConsumers, 0);
	}

	@Test
	public void testGenerateDollaDollaBills() {
		ArrayList<Consumer> consumers = s.getConsumers();
		for(Consumer c: consumers){
			assertEquals(0, c.getMoney());
		}
		for(Consumer c: consumers){
			c.dollaDollaBillYall();
			assert(c.getMoney()>0);
		}
	}

	@Test
	public void testProduceGoods() {
		s.produceGoods();
		assertNotNull(s.getFoodCart().getNumGoods());
		//assertEquals(s.getTravelingMerchant().getNumGoods(), 0);
		
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

}
