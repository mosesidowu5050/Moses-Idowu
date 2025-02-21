import java.util.Scanner;

	public class Pound{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Pound: ");
double firstNum = input.nextDouble();

double numInKilogram = firstNum * 0.454;
System.out.print("Kilogram : " + numInKilogram);

}

}