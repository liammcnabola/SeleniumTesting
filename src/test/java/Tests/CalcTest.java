package Tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Testing.Calculator;

public class CalcTest {

	private Calculator calc = new Calculator();
	
	@Test
	void testAdd() {
		Assertions.assertEquals(8, this.calc.add(4, 4));
	};

	@Test
	void testSubtract() {
		Assertions.assertEquals(10, this.calc.subtract(20, 10));
	};

	@Test
	void testMultiply() {
		Assertions.assertEquals(25, this.calc.multiply(5, 5));
	};

	@Test
	void testDivide() {
		Assertions.assertEquals(6, this.calc.divide(36, 6));
	}

	@Test
	void testFactorial() {
		Assertions.assertEquals("5!", this.calc.factorial(120));
	}

	@Test
	void testDoggo() {
		Assertions.assertEquals(10, this.calc.doggo(10));
	}
}
