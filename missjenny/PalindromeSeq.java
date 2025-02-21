import java.util.Scanner;
	public class PalindromeSeq{
	public static void main(String[] args){

Scanner connect = new Scanner(System.in);
	int userInput = 2;
	int count = 0;
	
	System.out.println("Enter five digit integer: ");
	userInput = connect.nextInt();


int extraction1 = userInput % 10;
int extraction2 = userInput / 10;
int extraction3 = extraction2 % 10;
int extraction4 = extraction2 / 10;
int extraction5 = extraction4 % 10;
int extraction6 = extraction4 / 10;
int extraction7 = extraction6 % 10;
int extraction8 = extraction6 / 10;

if (extraction1 == extraction8) System.out.println("It is a Palindrome " + userInput);

else System.out.println("Enter a new value");

	}
}