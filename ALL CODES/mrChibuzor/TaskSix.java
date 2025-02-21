public class TaskSixToTaskNine{
	public static void main(String[] args){

int count = 4;
int sum = 0;
int first = 1024;
int second = 2048;

while (count < 10){
	System.out.print(count*1 + " ");
	System.out.print(count*4 + " ");
	System.out.print(count*16 + " ");
	System.out.print(count*64 + " ");
	System.out.print(count*256 + " ");

	count = count + 4;
	sum = first + second;
}
System.out.println("\nSum the pair: " + sum);

  double squareRoot = Math.sqrt(sum); 
System.out.printf("Square root of %d: %f%n", sum, squareRoot);

}
}