	public class TaskOneToTaskFourLoop{
	public static void main(String[] args){

int count = 1;
int counter = 2;
int counts = 1;
int multiples = 4;


System.out.println("\nFirst Loop (count from 1 to 10):");
for (count = 1; count <= 10; count++){
	System.out.println(count);
}
 System.out.println("\nEven Numbers Loop (count from 1 to 10):");
while (counter <= 11){
	System.out.println(counter);
	counter = counter + 2;
}
System.out.println("\nOdd Numbers Loop (count from 1 to 10):");
while (counts < 10){
	System.out.println(counts);
	counts = counts + 2;
}
System.out.println("\nMultiples Of Four: ");
while (multiples < 10){
	System.out.print(multiples + " ");
	multiples = multiples + 4;

}
	}

}