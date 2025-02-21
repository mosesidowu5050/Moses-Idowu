//A person invests $1,000 in a savings account yielding 5% interest. Assuming that all
//the interest is left on deposit, calculate and print the amount of money in the //account
//at the end of each year for 10 years. Use the following formula to determine the
//amounts:
//a = p (1 + r)n
//where
//p is the original amount invested (i.e., the principal)... 1,000
//r is the annual interest rate (e.g., use 0.05 for 5%)... 0.05
//n is the number of years... 10
//a is the amount on deposit at the end of the nth year... 500

import java.util.Scanner;

public class Investment{
public static void main(String[] args){

Scanner reader = new Scanner(System.in);

	double principal;
	double deposit = 0;

final double SENTINEL = 0;

while (true){
	System.out.println("Enter The Principal Amount (or 0 to quit): )");
		principal = reader.nextDouble();


if (principal == SENTINEL){
	break;
}
	System.out.println("Enter The Interest (or 0 to quit): )");
		double interest = reader.nextDouble();


	System.out.println("Enter The Number of Years (or 0 to quit): )");
		double years = reader.nextDouble();

	deposit = principal * Math.pow(1 + interest, years);
}

	System.out.println("Amount On Deposit Is: " + deposit);

	}

}