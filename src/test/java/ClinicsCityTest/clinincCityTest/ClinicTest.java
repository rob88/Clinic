package ClinicsCityTest.clinincCityTest;

import org.junit.Test;
import Entity.Clinic;
import static org.junit.Assert.*;

/* 
 *Class  ClinicTest 
 *@ methodology Test Driven Development / Junit verson 4
 *This class is used to test all methods before implemented  
 *@author Ruben Faraj
 *@verson 0.1 
 *@Date 19-04-2017 
 **/
public class ClinicTest {

	/* Testing get and set id method */
	@Test
	public void testGetId() {
		Clinic test = new Clinic();// test created
		test.setId(1);
		int result = test.getId();
		assertEquals(1, result);

	}
	
	/* Testing getCity and setCity method   */ 

	@Test
	public void testGetCity() {
		Clinic test = new Clinic();// test created
		test.setCity("London");
		String result = test.getCity();
		assertEquals("London", result);

	}

	@Test
	public void testIsHealthy() {
		Clinic test = new Clinic();// test created
		boolean result = test.isHealthy();
		assertEquals(false, result);

	}

}
