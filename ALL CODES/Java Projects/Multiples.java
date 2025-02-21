import java.util.Scanner;

	public class Multiples{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Integer Number: ");
int firstNum = input.nextInt();

int numInMultiple = firstNum * 3;
System.out.print("Multiple Number: " + numInMultiple);

int numInDouble = firstNum + 3;
System.out.print("\nDouble Number: " + numInDouble);


}

}