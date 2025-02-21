/*
4.36 (Creating a Comparator) Write an application that works as a comparator. Your program
should read two numbers from the user and print 0 if they are equal to each other, 1 if the first
number is greater, and –1 if the second number is greater.
*/

import java.util.Scanner;

class CreatingAComparator {
	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

int total = 0;

System.out.print("Inputs number: ");
int firstNums = scan.nextInt();

System.out.print("Inputs number: ");
int secondNums = scan.nextInt();

if (firstNums == secondNums) {
    System.out.print("0");
} 

if (firstNums > secondNums) {
    System.out.println("1");

} else if (secondNums > firstNums){
   System.out.print("-1");
}

  }
}