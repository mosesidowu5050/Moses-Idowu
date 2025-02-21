import java.util.Scanner;
	public class AlgorithmDoWhile{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);
	
	int sum = 0;

	int count = 1;
while (count < 3){
	System.out.printf("Enter a number: ");
	int number = input.nextInt();
	count = count + 1; 
	sum += number;
}
	System.out.printf("%d Sum ", sum);



	}
	
}