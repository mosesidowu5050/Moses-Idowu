import java.util.Scanner;

public class MinAndMax{
public static void main(String[] args){

Scanner reader = new Scanner(System.in);

int sum = 0;
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;

for(int counter = 1; counter <= 5; counter++){
	System.out.println("Enter number: " + counter);
	int number = reader.nextInt();
	sum += number;

if (number < min){
	min = number;
}
if (number > max){
	max = number;
}


}
System.out.println("Sum Is: " + sum);
System.out.println("Minimun Is: " + min);
System.out.println("Maximum Is: " + max);


	}
}



//5.11 (Extremes) Write an application that finds the minimum and maximum amongst //several integers and then computes the sum of the two extremes. The user will be //prompted to input how many values the application should ask the user to input.
