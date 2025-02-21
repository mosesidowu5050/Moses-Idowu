import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {

        // Creating a Bank object
Bank bankOne = new Bank("", 1234, 0.0);

        // Printing name and balance
System.out.printf("Bank Name: %s%nBalance: %.2f%n", bankOne.getName(), bankOne.getBalance());

Scanner scan = new Scanner(System.in);

System.out.print("Enter deposited amount: ");
double depositedAmount = scan.nextDouble();
bankOne.deposit(depositedAmount);
System.out.printf("Bank Name: %s%nBalance: %.2f%n", bankOne.getName(), bankOne.getBalance());

System.out.print("Enter transfer amount: ");
double transferAmount = scan.nextDouble();
System.out.print("Kindly enter your pin: ");
int pin = scan.nextInt();
bankOne.transfer(pin, transferAmount);
System.out.printf("Bank Name: %s%nBalance: %.2f%n", bankOne.getName(), bankOne.getBalance());

    }
}