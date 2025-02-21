import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Enter three digit");
int number = input.nextInt();

int extraction1 = number % 10; 
number /= 10;
int extraction2 = number % 10; 
number /= 10;

int extraction3 = number % 10;

if (extraction1 == extraction3){
	System.out.printf("It is a Palindrome");
} else {
		System.out.printf("It is not a Palindrome");
}
}


}