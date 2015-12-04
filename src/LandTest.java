import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LandTest {

	Land newLand;

	@Before
	public void setUp() throws Exception {
		newLand = new Land(20);
	}

	@Test
	public void testIsRenewable() {
		assertTrue(newLand.isRenewable());
	}

	@Test
	public void testGetCurrentNumResources() {
		assertNotNull(newLand.getCurrentNumResources());
	}

	@Test
	public void testGetNumResources() {
		assertNotNull(newLand.getNumResources());
	}

}
