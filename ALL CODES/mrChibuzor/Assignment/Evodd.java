import java.util.Scanner;

	public class Evodd{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);

	System.out.printf("Enter a value to check for even and odd: ");
	int read = input.nextInt();

for (int a = 0; a < read; a++){
	System.out.println("\nEnter number: ");
	int mine = input.nextInt();

if (mine % 2 == 0){
		System.out.println(mine + "is largest. ");
} else {
	System.out.println(mine + "is smallest. ");
		

}	

	}

}


}