import java.util.Scanner;
public class ArithmeticInt{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Enter first number: ");
int number1 = input.nextInt();

System.out.printf("Enter second number: ");
int number2 = input.nextInt();

int num1 = number1 * number1;
	System.out.println("Num1 Square is: " + num1);
int num2 = number2 * number2;
	System.out.println("Num2 Square is: " + num2);
int sum = (number1 * number1) + number2 * number2;
	System.out.println("Sum Of Square is: " + sum);
int difference = (number1 * number1) - number2 * number2;
	System.out.println("Difference Of Square is: " + difference);



}

}