import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LandTest {
	
	Land newLand;
	@Before
	public void setUp() throws Exception {
		newLand = new Land();
	}

	@Test
	public void testIsRenewable() {
		assertTrue(newLand.isRenewable());
	}

	@Test
	public void testCurrentNumResources() {
		assertNotNull(newLand.currentNumResources());
	}

	@Test
	public void testGetNumResources() {
		assertNotNull(newLand.getNumResources());
	}

}
