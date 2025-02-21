public class TaskEight{

public static int largestElement(int[] numbers){

int largest = 0;

for ( int count = 0; count < numbers.length; count++){
	if (numbers[count] > largest) largest = numbers[count];
}
return largest;

}


public static void main(String[] args){

int[] numbers = {1 , 5, 3, 4, 5, 5};

System.out.println("The Largest Is: " + largestElement(numbers));

 }
}