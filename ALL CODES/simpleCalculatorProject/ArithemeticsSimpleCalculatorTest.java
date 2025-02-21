import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class ArithemeticsSimpleCalculatorTest {

	@Test
	public void addAsManyNumbers(){

	ArithemeticsCalculator myAdditionCheck = new ArithemeticsCalculator();
	int sumOfMultiply = myAdditionCheck.multiplyNumber(3, 5);
	assertEquals(15, sumOfMultiply);

   }

	@Test
	public void multiplyAllTwoNumbers(){
	ArithemeticsCalculator myMultiplyCheck = new ArithemeticsCalculator();
	int result = myMultiplyCheck.multiplyFeature(10, 4);
	assertEquals(40, result);


   }

	@Test
	public void addingAllNumbersTogether(){
	ArithemeticsCalculator myAddingAllCheck = new ArithemeticsCalculator();
	int total = myAddingAllCheck.summingNumbers(numbers);
	assertEquals(total, myAddingAllCheck);
	
   }
}