import java.util.Scanner;
public class Arithsmall{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Enter first number: ");
int number1 = input.nextInt();

System.out.printf("Enter second number: ");
int number2 = input.nextInt();

System.out.printf("Enter third number: ");
int number3 = input.nextInt();

int sum = number1 + number2 + number3;
	System.out.printf("Sum is: " + sum);
int average = (number1 + number2 + number3) / 3;
	System.out.println("\nAverage is: " + average);
int product = number1 * number2 * number3;
	System.out.println("Product is: " + product);
	System.out.println("Product is the Largest");
	System.out.println("Average is the Smallest");
}
}