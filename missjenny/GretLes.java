import java.util.Scanner;
	public class GretLes{
	public static void main(String[] args){

Scanner connect = new Scanner(System.in);

	int numb1;
	int numb2;
	int sum;

	System.out.println("Enter numberOne: ");
	numb1 = connect.nextInt();

	System.out.println("Enter numberTwo: ");
	numb2 = connect.nextInt();
	
	sum = numb1 + numb2;
	System.out.println("Sum is: " + sum);

if (sum > 100){
	System.out.println("Sum is greater than 100");
} else (sum < 100){
	System.out.println("Sum is lesser than 100");
}
if (sum < 100){ 
	System.out.println("Sum is lesser than 100");
 } else (sum < 100){
	System.out.println("Sum is greater than 100");
}

}


}