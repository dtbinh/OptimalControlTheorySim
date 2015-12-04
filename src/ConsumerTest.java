import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConsumerTest {
	Consumer c;

	@Before
	public void setUp() throws Exception {
		c = new Consumer();
	}

	@Test
	public void testGetMoney() {
		c.dollaDollaBillYall();
		assertNotNull(c.getMoney());
	}

	@Test
	public void testIsAlive() {
		assertTrue(c.isAlive());
		c.setIsAlive(false);
		assertFalse(c.isAlive());
	}

	@Test
	public void testCalculateRealSurvivalRate() {
		assertNotNull(c.calculateRealSurvivalRate());
	}

}
