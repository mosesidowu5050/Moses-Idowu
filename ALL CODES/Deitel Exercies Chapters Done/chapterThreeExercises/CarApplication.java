import java.util.Scanner;

public class CarApplication {
	public static void main(String[] args){

Car car1 = new Car ("Toyota Camry", "2025 Pro", 2000000.0);
Car car2 = new Car ("Porsche BMW", "2027 XP", 8000000.0);


Scanner scan = new Scanner(System.in);

System.out.printf("%s%s%.2f", "Price Is: ", "$",car1.getPrice());
System.out.println();

System.out.print("Enter deposit amount: $ ");
double price = scan.nextDouble();

System.out.print("What is the discount given: $ ");
double discount = scan.nextInt();
car1.deposit(price, discount);

System.out.printf("%s%s%.2f", "Price Is: ", "$",car2.getPrice());
System.out.println();

System.out.print("Enter deposit amount: $ ");
double price2 = scan.nextDouble();

System.out.print("What is the discount given: $ ");
double discount2 = scan.nextInt();
car2.deposit(price2, discount2);

System.out.println();
System.out.printf("%s%s%.2f", "1st Car Price Is: ", "$",car1.getPrice());
System.out.println();
System.out.printf("%s%s%.2f", "2nd Car Price Is: ", "$",car2.getPrice());

   }
}