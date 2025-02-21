/*
5.11 (Extremes) Write an application that finds the minimum and maximum amongst 
several integers and then computes the sum of the two extremes. The user will be 
prompted to input how many values the application should ask the user to input.
*/

import java.util.Scanner;

class Extremes {
	public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("How many integers do you want to input: ");
int values = scan.nextInt();

int minimum = 999999;
int maximum = 0;
int sum = 0;

for (int i = 1; i <= values; i++){
System.out.print("Input the integers: ");
int numbers = scan.nextInt();

if (numbers > maximum){
maximum = numbers;
}

if (numbers < minimum){
minimum = numbers;
   }
}
sum = maximum + minimum;
System.out.println("Maximum number is: " + maximum + "; Minimum number is: " + minimum + " \nSum of number is: " + sum);


   }
}