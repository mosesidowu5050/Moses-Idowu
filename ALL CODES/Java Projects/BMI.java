import java.util.Scanner;

	public class Bmi{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Weight Number: ");
float weightNum = input.nextFloat();

System.out.printf("Height Number: ");
float heightNum = input.nextFloat();

double numInBmi = weightNum / 0.0254;
System.out.print("BMI : " + numInBMI);

}
}