//Exercise 1: Write a program which repeatedly reads numbers until the user enters
//“done”. Once “done” is entered, print out the total, count, and average of the
//numbers. If the user enters anything other than a number, detect their mistake
//using try and except and print an error message and skip to the next number.

//repeating numbers
//calculate total, count, average of numbers.
import java.util.Scanner;

class UsersProgram{
	public static void main(String[] args){
	
Scanner reader =  new Scanner(System.in);

Boolean looping = true;
Boolean done = false;
int count = 0;
int wrongInput = 0;
int total = 0;
int numbers = 0;
double average = 0;

while (looping){
	try 
	{
		System.out.print("Enter numbers to be calculated(enter 'done' to end): ");
		numbers = reader.nextInt();
		count++;
		total += numbers;
		average = total / count;
	} 

	catch (Exception e)
	{
		while (numbers != 
		System.out.print("\nSummary of your operations..");
		wrongInput++;
		
	} 

	finally {
		if (numbers == 0) break;
	}	
	
	} 
			
		
		
	System.out.println("\nTotal is: " + total);
	System.out.println("Count is: " + count);
	System.out.println("Average is: " + average);
	System.out.println("Wrong Input entered: " + wrongInput);
	
	}
}