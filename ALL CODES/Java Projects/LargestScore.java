import java.util.Scanner;

	public class LargestScore{
	public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);

	System.out.printf("First score: ");
	int largest = inputCollector.nextInt();

	System.out.printf("Second score: ");
	int userInput = inputCollector.nextInt();
if (userInput > largest) largest = userInput;	

	System.out.printf("Third score: ");
	userInput = inputCollector.nextInt();
if (userInput > largest) largest = userInput;	
	
	System.out.printf("Fourth score: ");
	userInput = inputCollector.nextInt();
if (userInput > largest) largest = userInput;	
	
	System.out.printf("Fifth score: ");
	userInput = inputCollector.nextInt();

if (userInput > largest) largest = userInput;	
System.out.println("Largest is: " + largest);
	
	

	
	}


}