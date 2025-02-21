import java.util.Scanner;

	public class LSI{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Largest Number: ");
int largeNum = input.nextInt();

int numInSmall = largeNum - 25;
System.out.print("Number in small: " + numInSmall);

}

}