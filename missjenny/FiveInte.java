import java.util.Scanner;

public class FiveInte{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a first number: ");
	int first_number = input.nextInt();
	
	System.out.print("Enter a second number: ");
	int second_number = input.nextInt();
	
	System.out.print("Enter a third number: ");
	int third_number = input.nextInt();

	System.out.print("Enter a fourth number: ");
	int fourth_number = input.nextInt();

	System.out.print("Enter a fifth number: ");
	int fifth_number = input.nextInt();
	
	
	if (first_number > second_number && first_number > third_number && first_number > fourth_number && first_number > fifth_number){
	System.out.print(first_number);
}

	else if(second_number > first_number && second_number > third_number && second_number > fourth_number && second_number > fifth_number){
	System.out.print(second_number);
}

	else if(third_number > first_number && third_number > second_number && third_number > fourth_number && third_number > fifth_number){
	System.out.print(third_number);
}
	
	else if(fourth_number > first_number && fourth_number > second_number && fourth_number > third_number && fourth_number > fifth_number){
	System.out.print(fourth_number);

}
	else{
	System.out.print(fifth_number);

}
	System.out.print("\nSmallest: ");


if (first_number < second_number && first_number < third_number && first_number < fourth_number && first_number < fifth_number){
	System.out.print(first_number);
}

	else if(second_number < first_number && second_number < third_number && second_number < fourth_number && second_number < fifth_number){
	System.out.print(second_number);
}

	else if(third_number < first_number && third_number < second_number && third_number < fourth_number && third_number < fifth_number){
	System.out.print(third_number);
}
	
	else if(fourth_number < first_number && fourth_number < second_number && fourth_number < third_number && fourth_number < fifth_number){
	System.out.print(fourth_number);

}
	else{
	System.out.print(fifth_number);

}

	

}
}