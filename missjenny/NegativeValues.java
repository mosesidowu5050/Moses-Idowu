import java.util.Scanner;
	public class NegativeValues{
	public static void main(String[] args){

	int zeroValues = 0;
	int positiveValues = 0;
	int negativeValues = 0;
	int real = 5;
	int count = 1;
		
Scanner input = new Scanner(System.in);

System.out.println("Enter five integers: ");

for (count = 1; count <= real; count++){

System.out.println("Enter number " + count);
int numberStore = input.nextInt();

if (numberStore > 0) positiveValues++;
if (numberStore < 0) negativeValues++;
if (numberStore == 0) zeroValues++;
}

System.out.println("Numbers Of Positives Inputs: " + positiveValues);
System.out.println("Numbers Of Negatives Inputs: " + negativeValues);
System.out.println("Numbers Of Zero Inputs: " + zeroValues);

	}
}