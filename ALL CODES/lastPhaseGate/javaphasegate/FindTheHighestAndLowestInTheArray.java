import java.util.Arrays;

class FindTheHighestAndLowestInTheArray{
	public static int[] getTheHighetAndLowest(int[] arrays ){

int highest = 0;
int lowest = 0;
int indexHighest = 0;
int indexLowest = 0;

int total = 0;

int[] newArrays = new int[1];

	for (int count = 0; count < arrays.length; count++){
		if (arrays[count] > highest){
		highest = arrays[count];
		
	}	
		else if (arrays[count] < lowest){
		lowest = arrays[count];
				
	     }	
 	 }
	
	return new int[] {highest, lowest};
}


public static void main(String[] args){

int[] arrays = {4, 6, 2, 5, 0, -1, 1000};

int[] result = getTheHighetAndLowest(arrays);

System.out.print(Arrays.toString(result));

   }
}