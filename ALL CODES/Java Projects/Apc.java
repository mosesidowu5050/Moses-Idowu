import java.util.Scanner;

	public class Apc{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Radius Number: ");
float radiusNum = input.nextFloat();

System.out.printf("formula: ");
float formulaNum = input.nextFloat();

double numInArea = radiusNum * radiusNum * formulaNum;
System.out.print("Area : " + numInArea);

double numInPerimeter = 2 * radiusNum + formulaNum;
System.out.print("\nPerimeter : " + numInPerimeter);


}
}