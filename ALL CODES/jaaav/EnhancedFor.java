
	public class EnhancedFor{
	public static void main(String... moses){

	int[] ages = {4, 6, 8, 10, 11};


int total = 0;
int average = 0;
int largest = 0;

	for (int counter : ages){
		total += counter;
		average = total / 5;
	if (counter > largest);
		largest = counter;
	}


System.out.println(total);
System.out.println(average);
System.out.println(largest);

	}

}