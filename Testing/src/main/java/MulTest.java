import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MulTest {

	@Test     //Important
	public void something()
	{
		//Given for set of inputs 
		Calculator calculator = new Calculator();
		
		//when something happens
		double result = calculator.multiply(2.0, 3.0);
		
		//assert that result is 6.0
		//then what is the behaviour
		assertEquals(6.0, result); // expected vs result
	}
}
