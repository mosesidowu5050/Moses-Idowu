import java.util.Scanner;
public class Areaoftriangle{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.printf("Enter value for x1: ");
int point1 = input.nextInt();

System.out.printf("Enter value for y1: ");
int point2 = input.nextInt();

System.out.printf("Enter value for x2: ");
int point3 = input.nextInt();

System.out.printf("Enter value for y2: ");
int point4 = input.nextInt();

System.out.printf("Enter value for x3: ");
int point5 = input.nextInt();

System.out.printf("Enter value for y3: ");
int point6 = input.nextInt();

int side = (point1 + point2) * (point3 + point4) * (point5 + point6) / 2;
	System.out.printf("Side is: " + side);

double area = (side - point1 - point2) * (side - point3 - point4) * (side - point5 - point6);
	double result = Math.sqrt(area);

	System.out.printf("\nArea is: " + result);



}
}