import java.util.*;

	public class ReverseArray{

	static void reverse (Integer ages[]){
	Collections.reverse(Arrays.asList(ages));
	System.out.println("Reversed Array: " + Arrays.asList(ages));

}

	public static void main(String[] args){
Integer [] ages = {90, 85, 70, 65, 50, 35};
	reverse(ages);

	}

}