import java.util.Scanner;
	public class FiveFlow{
	public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.printf("Enter First Integer: ");
int number1 = scanner.nextInt();

System.out.print("Enter Second Integer: ");
int number2 = scanner.nextInt();

System.out.print("Enter Third Integer: ");
int number3 = scanner.nextInt();

System.out.print("Enter Fourth Integer: ");
int number4 = scanner.nextInt();

System.out.print("Enter Fifth Integer: ");
int number5 = scanner.nextInt();

if (number1 >= number2 && number1 >= number3 && number1 >= number4 && number1 >= number5){
	System.out.println("number1 is the greatest");
}
else {
	System.out.println("number1 is not the greatest");
}
if (number2 <= number1 && number2 <= number3 && number2 <= number4 && number2 <= number5){
	System.out.println("number1 is the greatest");
}
else {
	System.out.println("number1 is not the greatest");

}

}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                