import java.util.Scanner;

	public class Apr{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Width Number: ");
float widthNum = input.nextFloat();

System.out.printf("Height Number: ");
float heightNum = input.nextFloat();

double numInArea = widthNum * heightNum;
System.out.print("Area : " + numInArea);

double numInPerimeter = 2 * widthNum + heightNum;
System.out.print("\nPerimeter : " + numInPerimeter);


}
}