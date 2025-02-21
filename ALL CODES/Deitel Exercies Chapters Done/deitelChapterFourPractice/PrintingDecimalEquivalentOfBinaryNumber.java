/*
4.32 (Printing the Decimal Equivalent of a Binary Number) Write an application that inputs
an integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent. [Hint:
Use the remainder and division operators to pick off the binary number’s digits one at a time, from
right to left. In the decimal number system, the rightmost digit has a positional value of 1 and the
next digit to the left a positional value of 10, then 100, then 1000, and so on. The decimal number
234 can be interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost digit
has a positional value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so
on. The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]
*/


import java.util.Scanner;

class PrintingDecimalEquivalentOfBinaryNumber {
	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

int total = 0;

System.out.print("Inputs four integer seperated by space containing only 0s and 1s (a binary integer): ");
int binaryNums1 = scan.nextInt();
int result1 = binaryNums1 * 8;

int binaryNums2 = scan.nextInt();
int result2 = binaryNums2 * 4;

int binaryNums3 = scan.nextInt();
int result3 = binaryNums3 * 2;

int binaryNums4 = scan.nextInt();
int result4 = binaryNums4 * 1;

      total = result1 + result2 + result3 + result4;

System.out.println("The decimal equivalent of binary " + binaryNums1 + binaryNums2 + binaryNums3 + binaryNums4 + " is " + total);

   }
}
