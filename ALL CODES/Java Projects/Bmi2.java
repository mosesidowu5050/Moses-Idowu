import java.util.Scanner;

	public class Bmi2{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Weight Number: ");
float kiloNum = input.nextFloat();

System.out.printf("Height Number: ");
float meterNum = input.nextFloat();

double numInBmi = kiloNum / meterNum;
System.out.print("Bmi : " + numInBmi);

}
}