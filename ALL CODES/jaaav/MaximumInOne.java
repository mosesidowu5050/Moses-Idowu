import java.util.*;

	public class ArrayKata{
	public static void main(String[] args){

int[] numbers = {15, 57, 5, 32, 18};

List<Integer> search = new ArrayList<>();

int largest = 0;


for(int counter = 1; counter < numbers.length; counter++){
	search.add(numbers[counter]);	
}

System.out.println("Largest Is: " + Collections.max(search));

	}

}