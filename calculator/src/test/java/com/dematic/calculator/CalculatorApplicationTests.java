package com.dematic.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void PlusTest() {
		Calculator calculator = new Plus(3, 4);
		float result = calculator.result();
		assertThat(result).isEqualTo(7);
	}
	
	@Test
	void MinusTest() {
		Calculator calculator = new Minus(7, 4);
		float result = calculator.result();
		assertThat(result).isEqualTo(3);
	}
	
	@Test
	void DivideTest() {
		Calculator calculator = new Divide(8, 4);
		float result = calculator.result();
		assertThat(result).isEqualTo(2);
		
		calculator = new Divide(2, 4);
		result = calculator.result();
		assertThat(result).isEqualTo(0);
		
	}
	
	@Test
	void MultiplicationTest() {
		Calculator calculator = new Multiplication(2, 4);
		float result = calculator.result();
		assertThat(result).isEqualTo(8);
	}
}
