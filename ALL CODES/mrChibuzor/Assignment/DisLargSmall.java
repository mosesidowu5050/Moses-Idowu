import java.util.Scanner;

	public class DisLargSmall{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int largest = input.nextInt();
	
	System.out.println("Enter a number: ");
	int smallest = input.nextInt();

if (smallest > largest) largest = smallest;
	System.out.println("The largest is " + largest);

if (largest < smallest) smallest = largest;
	System.out.println("The Smallest is " + smallest);

System.out.println("Do you want to enter another number? yes/no: ");
	int number = input.nextInt();

	System.out.println("The largest is " + largest);
	System.out.println("The smallest is " + smallest);

		
	}
}