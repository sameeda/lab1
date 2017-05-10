package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LightBulbTest {
	
	LightBulb lightbulb;

	@Before
	public void setUp() throws Exception {
		lightbulb=new LightBulb(100);
	}
	

	
	@Test
	public void testGetBulbWattage() {
		
		assertEquals(100,lightbulb.getBulbWattage());
	}

}
