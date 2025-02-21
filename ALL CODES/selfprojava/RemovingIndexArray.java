import java.util.Arrays;

class RemovingIndexArray{
	private static int[] getTheRestArray(int[] arrays, int target){

int count = 0;
int index= 0;

	for(int num : arrays){
	if(num != target){
	count++;
	}
	}
int[] original = new int[count];

	for(int num : arrays){
	if(num != target){
	original[index++] = num;
	}
	}
	
	return original;
}

public static void main(String[] args){

int target = 7;
int [] arrays = {10, 5, 2, 6, 7};

int[] result = getTheRestArray(arrays, target);

System.out.println(Arrays.toString(result));


  }
}