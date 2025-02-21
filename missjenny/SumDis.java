import java.util.Scanner;
	
	public class SumDis{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);

	
	System.out.println("Enter number1: ");
	int numb1 = input.nextInt();

	System.out.println("Enter number2: ");
	int numb2 = input.nextInt();

	System.out.println("Enter number3: ");
	int numb3 = input.nextInt();

	System.out.println("Enter number4: ");
	int numb4 = input.nextInt();

	System.out.println("Enter number5: ");
	int numb5 = input.nextInt();

	System.out.println("Enter number6: ");
	int numb6 = input.nextInt();


	int numSum = numb1 + numb2 + numb3 + numb4 + numb5;
	int sum = numSum / 2;
	
	System.out.println("Sum is "+ sum);


	}


}