import java.util.Scanner;

class GreatestCommonDivisorQuestionOne{
	public static int getCommonDivisor(int numberOne, int numberTwo){

int counter =0;
int roll = 0;

	for (int count = 1; count <= 2; count++){

		if (numberOne % count == 0){
		
	}

		if (numberTwo % count == 0){
		roll++;
	}
   }
	return roll;
}

public static void main(String[] args){

Scanner reader = new Scanner(System.in);

int numberOne = reader.nextInt();
int numberTwo = reader.nextInt();

int result = getCommonDivisor(numberOne, numberTwo);
System.out.print("Greatest Divisor Is: " + result);
   }
}