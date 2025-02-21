import java.util.Scanner;
	public class CreditLimit{
	public static void main(String[] args){

	int newBalance;

Scanner user = new Scanner(System.in);

	System.out.println("Account Number: ");
	String accountNumber= user.nextLine();

	System.out.println("Enter the Beginning Balance: ");
	int beginningBalance = user.nextInt();

	System.out.println("Enter the Charges: ");
	int charges = user.nextInt();

	System.out.println("Enter Total Credit Applied: ");
	int creditApplied= user.nextInt();

	System.out.println("Enter Total Credit: ");
	int credit = user.nextInt();

newBalance = (beginningBalance + charges ) - credit;

System.out.println("New Balance is: " + newBalance);


if (newBalance > credit) System.out.println("Credit Limit Not Exceeded");

else System.out.println("Credit Limit Exceeded");


	}

}