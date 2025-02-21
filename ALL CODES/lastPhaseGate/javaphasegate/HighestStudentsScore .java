import java.util.Arrays;

class HighestStudentsQuestionFive{
	public static int getStudentsHighestScore(int[] arrays ){

int highest = 0;
int lowest = 0;
int total = 0;

int[] newArrays = new int[1];

	for (int row = 0; row < arrays.length-1; row++){
		for (int column = 0; column < arrays[row].length; column++){

	total += arrays[column];

		System.out.print(total + " ");
		
	}	
	     	
 	 }
	return total;
}


public static void main(String[] args){

int[][] arrays = {{30, 40, 50}, 
	          {10, 20, 50}};

int result = getStudentsHighestScore(arrays);

System.out.print(Arrays.toString(result));

   }
}