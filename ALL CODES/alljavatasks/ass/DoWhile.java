import java.util.Scanner;
public class DoWhile{
	public static void main(String[] args){

	Scanner inputCollector = new Scanner(System.in);

	int number;
	int userInput;
do {
	System.out.println("Enter number1: ");
	number = inputCollector.nextInt();

	System.out.println("Enter number2: ");
	userInput = inputCollector.nextInt();
	
	int sum = number + userInput;
	System.out.printf("Sum %d%n", sum);
	
if (number == 0) {


System.out.println("Do you wish to perform the operation again? yes/no: ");
	userInput = inputCollector.nextInt();
}
	
} while (number != 0 && userInput != 0);

	System.out.println();

	}
}