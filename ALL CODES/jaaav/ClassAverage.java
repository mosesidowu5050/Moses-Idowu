import java.util.Scanner;

public class ClassAverage{
public static void main(String[] args){

Scanner userReader = new Scanner(System.in);

int count = 1;
int total = 0;
int average = 0;
	
for (count = 1; count <= 5; ++count){
	System.out.println("Enter grade: " + count);
	int grade = userReader.nextInt();
	
	total = total + grade;	
}
System.out.println("Total is: " + total);

	average = total / 5;
System.out.println("Average is: " + average);

}


}