public class CompoundInterest{
public static void main(String[] args){

double principal = 1000;
double rate = 0.05; double rate2 = 0.06; double rate3 = 0.07; double rate4 = 0.08;
double rate5 = 0.09; double rate6 = 0.1;
double years = 10;
double deposit1 = 0; double deposit2 = 0; double deposit3 = 0; double deposit4 = 0;
double deposit5 = 0; double deposit6 = 0;

for(int count = 1; count <= 10; count++){
	deposit1 = principal * Math.pow(1 + rate, years);
	deposit2 = principal * Math.pow(1 + rate2, years);
	deposit3 = principal * Math.pow(1 + rate3, years);
	deposit4 = principal * Math.pow(1 + rate4, years);
	deposit5 = principal * Math.pow(1 + rate5, years);
	deposit6 = principal * Math.pow(1 + rate6, years);

}
System.out.printf("Amount On Deposit 5percent Is %.2f", deposit1);
System.out.printf("\nAmount On Deposit 6percent Is %.2f%n", deposit2);
System.out.printf("Amount On Deposit 7percent Is %.2f%n", deposit3);
System.out.printf("Amount On Deposit 8percent Is %.2f%n", deposit4);
System.out.printf("Amount On Deposit 9percent Is %.2f%n", deposit5);
System.out.printf("Amount On Deposit 10percent Is %.2f%n", deposit6);
	}
}


//5.14 (Modified Compound-Interest Program) Modify the compound-interest application of
//Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a //for loop to vary the interest rate.