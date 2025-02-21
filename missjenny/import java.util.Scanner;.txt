import java.util.Scanner;
public class SumInteger{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Enter a number: ");
int number = input.nextInt();

int extraction1 = number % 10; 
number /= 10;
int extraction2 = number % 10; 
number /= 10;

int extraction3 = number % 10;

int sum = extraction1 + extraction2 + extraction3;
	System.out.printf("Sum of the digit is: " + sum);

}

}