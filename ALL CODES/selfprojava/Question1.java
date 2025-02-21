class Question1 {
	public static boolean getThePowerOfN(int number){

int temp = 2;

for (int count = 0; count <= number; count++){

	if (2 * count == number){

	return true;

	 } else {
		return false;
	} 
}
	
}


public static void main(String[] args){

int input = 16;
boolean result = getThePowerOfN(input);
System.out.println(result);

   }
}