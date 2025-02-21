import java.util.Arrays;

class FindTheHighest{
	public static int[] getTheHighest(int[] arrays ){

int highest = 0;
int[] resultArrays = new int[1];

	for (int count = 0; count <= arrays.length-1; count++){
		if (arrays[count] > highest){
		highest = arrays[count];
		resultArrays[0] = highest;
		
	     }	
 	 }
	return resultArrays;
}


public static void main(String[] args){

int[] arrays = {1, 4, 5, 6, 9, 7, 10, 9, 1000};

int[] result = getTheHighest(arrays);

System.out.print(Arrays.toString(result));

   }
}