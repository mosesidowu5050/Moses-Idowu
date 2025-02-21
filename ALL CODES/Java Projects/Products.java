import java.util.Scanner;

	public class Products{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("First Value: ");
int num1 = input.nextInt();

System.out.print("Second Value: ");
int num2 = input.nextInt();

System.out.print("Third Value: ");
int num3 = input.nextInt();

System.out.print("Fourth Value: ");
int num4 = input.nextInt();

System.out.print("Fift Value: ");
int num5 = input.nextInt();

if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
	System.out.printf("Num1 is the Largest");
} else {
	System.out.printf("Num1 is the Smallest");
}
if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
	System.out.printf("Num2 is the Largest");
} else {
	System.out.printf("Num2 is the Smallest");
}
if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
	System.out.printf("Num3 is the Largest");
} else {
	System.out.printf("Num3 is the Smallest");
}
if (num4 > num1 && num4 > num2 && num4 > num4 && num1 > num5){
	System.out.printf("Num1 is the Largest");
} else {
	System.out.printf("Num1 is the Smallest");
}




	}
}