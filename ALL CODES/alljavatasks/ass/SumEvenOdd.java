import java.util.Scanner;
	
	public class SumEvenOdd{
	public static void main(String []args) {

        Scanner input = new Scanner(System.in);
	
	int i = 0;
	int num = 0;
	int sumOdd = 0;
	int sumEven = 0;
	
System.out.println("Enter a set of integers: ");
        num = input.nextInt();

        System.out.println("The sum of the numbers are: ");
	
for (i = num; i !=0; i = i){
if (i % 2 == 0){
	sumEven = sumEven + i;
} else 
	sumOdd = sumOdd + i;
	i = input.nextInt();
}
        System.out.println("Even sum: " + sumEven);
        System.out.println("Odd sum: " + sumOdd);
    }
}