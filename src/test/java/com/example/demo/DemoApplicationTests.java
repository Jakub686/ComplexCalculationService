package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {


	@Test
	void contextLoads() {

		ComplexCalculationService complexCalculationService = new ComplexCalculationService();

		//given
		int input1 = 1;
		int input2 = 2;

		//when
		Double methodResult = complexCalculationService.add(input1, input2);
		Double expected = 3.0;
		//then
		assertEquals(methodResult,expected);


	}

}
