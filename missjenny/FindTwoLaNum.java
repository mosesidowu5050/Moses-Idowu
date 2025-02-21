import java.util.Scanner;
	public class FindTwoLaNum{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);
	
	int firstLargest;
	int secondLargest;
	int numberInput;
	int count = 0;

while (count <= 10){
	System.out.println("Enter numbers1: " + count);
	firstLargest = input.nextInt();
	count = count++;

	System.out.println("Enter numbers2: ");
	secondLargest = input.nextInt();

	System.out.println("Enter numbers3: ");
	numberInput = input.nextInt();

	System.out.println("Enter numbers4: ");
	int numberInput1 = input.nextInt();

	System.out.println("Enter numbers5: ");
	int numberInput2 = input.nextInt();

if (numberInput < firstLargest && numberInput < secondLargest);
if (numberInput1 < firstLargest && numberInput1 < secondLargest);

	System.out.println("First Number is Largest: " + firstLargest);
	System.out.println("Second Number is Largest: " + secondLargest);
} 




	}

}