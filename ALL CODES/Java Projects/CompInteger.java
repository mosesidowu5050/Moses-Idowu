import java.util.Scanner;

	public class CompInteger{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Interger Number: ");
int firstNum = input.nextInt();

int numInSquare = firstNum + 50;
System.out.print("Greater Than: " + numInSquare);

int numInEqual = firstNum = 100;
System.out.print("\nEqual To: " + numInEqual);

int numInNotEqual = firstNum - 50;
System.out.print("\nNot Equal To: " + numInNotEqual);

int numInLess = firstNum - 50;
System.out.print("\nLess Than: " + numInLess);



}

}