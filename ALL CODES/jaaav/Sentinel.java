public class Sentinel{

public static long factorial(int number, int number2){

int result = 1; 
int result2 = 1;

	for (int count = 1; count <= number; count++){
		result *= count;
}
	for (int counter = 1; counter <= number2; counter++){
		result2 *= counter;
}
	return result;
	return result2;
}
public static void main(String[] args){

System.out.println(factorial(5, 5));


}



}