import java.util.Scanner;

	public class Diameter1{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Float Number: ");
float firstNum = input.nextFloat();

float numInDiameter = firstNum * 2;
System.out.print("Diameter : " + numInDiameter);

double numInCircumference = firstNum * 2 * 3.14159;
System.out.print("\nCircumference : " + numInCircumference);

double numInArea = firstNum * 2 * 6.28318;
System.out.print("\nArea : " + numInArea);

}
}