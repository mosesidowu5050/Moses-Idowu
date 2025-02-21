import java.util.Scanner;

	public class Divisible{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Dvisible Number: ");
int divNum = input.nextInt();

int numInRemainder = divNum / 10;
System.out.print("Remainder Number: " + numInRemainder);

}

}