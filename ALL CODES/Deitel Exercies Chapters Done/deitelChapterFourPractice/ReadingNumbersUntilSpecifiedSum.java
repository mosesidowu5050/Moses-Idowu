/*
4.34 (Reading numbers until a specified sum) Write an application that asks for 
a number from the user and then keeps reading integer values from the user 
until the sum of those integers equals or becomes greater than the value that 
was input in the beginning.
*/

import java.util.Scanner;

class ReadingNumbersUntilSpecifiedSum {
	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

int total = 0;

System.out.print("Inputs number: ");
int inputSum = scan.nextInt();

System.out.print("Inputs number: ");
int readingNums = scan.nextInt();
total += readingNums;

while (total < inputSum) {
System.out.print("Continue to input number: ");
readingNums = scan.nextInt();
total += readingNums;
}
if (total == inputSum){
    System.out.println("Number becomes equals to the value that was input in the beginning: " + total);
} else if (total > inputSum) {
    System.out.println("Number becomes greater than the value that was input in the beginning: " + total);
}


  }
}