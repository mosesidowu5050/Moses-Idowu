import java.util.Scanner;

	public class LoopDoWhile{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);

	int first;
	int second;
	int sum;
	String repeat;

do { 
	System.out.println("Enter number 1: ");
	first = input.nextInt();
	System.out.println("Enter number 2: ");
	second = input.nextInt();

sum = first + second;
	System.out.println("Sum is " + sum);
	System.out.print("Do you want to perform the operation again? (Y/N): ");
	repeat = input.next();

} while (repeat == ("Y"));
	input.close();

	
}
	

}