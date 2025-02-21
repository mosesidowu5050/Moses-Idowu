import java.util.Scanner;
public class TwoNumbers{
	public static void main(String[] args){

	Scanner inputCollector = new Scanner(System.in);

	System.out.println("Enter number1: ");
	int number = inputCollector.nextInt();

	System.out.println("Enter number2: ");
	int userInput = inputCollector.nextInt();
	
int value = number * userInput * userInput;


	System.out.printf("Value %d%n", value);
	
	}
}