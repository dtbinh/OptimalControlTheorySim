import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WoodTest {

	Wood testWood;
	@Before
	public void setUp() throws Exception {
		testWood=new Wood();
	}

	@Test
	public void testIsRenewable() {
		assertFalse(testWood.isRenewable());
	}

	@Test
	public void testGetCurrentNumResources() {
		assertNotNull(testWood.getCurrentNumResources());
	}

	@Test
	public void testGetNumResources() {
		assertNotNull(testWood.getNumResources());
	}

}
