import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class SimpleCalculatorTest{

	@Test
	public void tesThatCalculatorCanAddTwoNumbers(){
		//Precondition
	   SimpleCalculator myCalculator = new SimpleCalculator();
		//Action
	   int sum =  myCalculator.add(2, 4);
		//Check or Assert
	   assertEquals(6, sum);
	
   }

	@Test
	public void tesThatCalculatorCanSubstractTwoNumbers(){
	SimpleCalculator mySubstraction = new SimpleCalculator();
	int result = mySubstraction.sub(16, 16);
	assertEquals(0, result); 
   } 
}
 


//You can Refactor ur test in this way also... 
//assertEquals(6, myCalculator.add(2, 4));

//the compiler to compile the junit in the terminal is this
//jUnit test case does not take parameters
//@Test means an anotation used in testing the method
