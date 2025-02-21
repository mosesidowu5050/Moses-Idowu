import java.util.Scanner;

	public class ConvertSquare{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Meter Number: ");
float meterNum = input.nextFloat();

double numInPing = meterNum * 0.3025;
System.out.print("Ping : " + numInPing);

}
}