package com.john.myproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleMathTest {
	SimpleMath sm;
	
	@BeforeEach // run setup() method for every test method.
	void setUp() throws Exception {
		sm = new SimpleMath(); // guaranty each test use a new sm object
	}

	@Test
	void testCircleAreaWithRadiusIs1() {
		double expected = Math.PI;
		try {
			double actual = sm.circleArea(1.0);
			assertEquals(expected, actual);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testCircleAreaWithRadiusIs0() {
		double expected = 0.0;
		try {
			double actual = sm.circleArea(0.0);
			assertEquals(expected, actual);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testCircleAreaWithNegativeRadius() {
		Exception exception = assertThrows(InvalidValueException.class, ()->{
			sm.circleArea(-2.0);
		});
		String expected = "Radius of a circle cannot be negative.";
		String actual = exception.getMessage();
		assertEquals(expected, actual);
	}

}
