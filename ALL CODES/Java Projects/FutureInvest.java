import java.util.Scanner;

	public class FutureInvest{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Investment Amount: ");
int investNum = input.nextInt();

System.out.printf("Annual Interest Rate: ");
float annualNum = input.nextFloat();

System.out.printf("Number Of Year: ");
int yearNum = input.nextInt();

double numInFutureInvestmentValue = investNum * 1 + annualNum / yearNum;
System.out.print("\n%nFutureInvestmentValue : " + numInFutureInvestmentValue);


}
}