import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MetalTest {
	
	Metal testMetal;
	@Before
	public void setUp() throws Exception {
		testMetal = new Metal();
	}

	@Test
	public void testIsRenewable() {
		assertFalse(testMetal.isRenewable());
	}

	@Test
	public void testGetCurrentNumResources() {
		assertEquals(testMetal.getCurrentNumResources(), 0);
	}

	@Test
	public void testGetNumResources() {
		assertEquals(testMetal.getNumResources(), 0);
	}

}
