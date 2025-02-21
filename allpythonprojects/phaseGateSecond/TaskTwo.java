public class TaskTwo{

public static int getUniqueSum(int[] arrays){

	int sum = 0;


	for (int array : arrays){
	if (array != 2){
	sum += array;

  }
  }
return sum;
}

public static void main(String[] args){

int[] arrays = {1, 2, 3, 2};


System.out.println("The Sum Is: " + getUniqueSum(arrays));
  }
}