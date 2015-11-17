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
		assertEquals(testWood.getCurrentNumResources(), 0);
	}

	@Test
	public void testGetNumResources() {
		assertEquals(testWood.getNumResources(),0);
	}

}
