import java.util.Arrays;

class Question4 {
	public static int[] getTheElements(int[] arrays){

int temp = 2;
int[] newArrays = new int[arrays.length];
int largest1 = 0;

for (int i = 0; i < arrays.length-1; i++){
//for (int j = 1; j < arrays.length; j++){
	if (arrays[i] > largest1){
	largest1 = arrays[i];
	newArrays[0] = largest1;
	}
	if (arrays[i] > largest1){
	newArrays[] = arrays[i];
	}
//}
}
	return newArrays;
}


public static void main(String[] args){

int[] arrays = {1, 4, 6, 2, 5};
int[] result = getTheElements(arrays);

//for (int num : result){
//System.out.print(num + " ");
//}
System.out.println(Arrays.toString(result));
}
}