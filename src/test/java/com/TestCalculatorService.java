package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {
		@Test
		public void testSum() {
			CalculatorService calculatorservice=new CalculatorService();
			
			Assertions.assertEquals(40, calculatorservice.sum());
		}
		@Test
		public void testMultiply() {
			CalculatorService calculatorservice=new CalculatorService();
			
			Assertions.assertEquals(300, calculatorservice.multiply());
	}

	
}
