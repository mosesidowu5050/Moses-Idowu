import java.util.Scanner;
	public class NegativeValues{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.printf("Enter first integer: ");
int num1 = input.nextInt();

System.out.printf("Enter second integer: ");
int num2 = input.nextInt();

System.out.printf("Enter third integer: ");
int num3 = input.nextInt();

System.out.printf("Enter fourth integer: ");
int num4 = input.nextInt();

System.out.printf("Enter fifth integer: ");
int num5 = input.nextInt();

	int zeroValues = 0;
	int positiveValues = 1;
	int negativeValues = 0;

if (num1 > 0){
	System.out.printf("%d%s positiveValues", 1 + positiveValues);
 } else {
	System.out.printf("%s zeroValues", zeroValues);


	}


}