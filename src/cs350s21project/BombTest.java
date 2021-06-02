package Part2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Part2.Bomb.*;

class BombTest {

	@Test
	void testWind() throws Exception {
		
	}
	
	@Test
	void testRelease() throws Exception {
		Bomb test = new Bomb(100,200,300,10,E_ErrorType.NONE,0,0,0);
		
		Coordinates testCor = test.getReleaseCoordinates();
		
		assertEquals(100,testCor.getX());
		assertEquals(200,testCor.getY());
		assertEquals(300,test.getReleaseAltitude());
		assertEquals(10,test.getDescentSpeed());
	}
	
	@Test
	void testError() throws Exception {
		
	}
	
	
	@Test
	void test() throws Exception {
		int count = 0, random;
		Random ran = new Random();
		while (count < 100) {
			//for determining which type of error/wind will be used
			random = ran.nextInt((6-1) + 1) + 1;
			
			
			count++;
		}
	}
	
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}
//
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
