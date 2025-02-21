import java.util.Scanner;

	public class Acceleration{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("End Velocity: ");
int endNum = input.nextInt();

System.out.printf("Start Velocity: ");
int startNum = input.nextInt();

System.out.printf("Time Span: ");
int timeNum = input.nextInt();

int numInAcceleration = (20 - 5) / 3;
System.out.print("Acceleration : " + numInAcceleration);


}
}