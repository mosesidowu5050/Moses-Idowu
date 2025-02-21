//input[10, 2, 38, 22, 38, 23]... [2, 10, 22, 23, 38, 38]
//median[30]

class LoopingSortingArray{
	public static void main(String[] args){

int[] arrays = {10, 2, 38, 22, 38, 23};

int sum = arrays.length;
int target = 0;

for (int count : arrays){
	System.out.print(count + " ");
 }

System.out.println();

for (int c = 0; c < sum; c++){
	for (int j = 0; j < sum-1; j++){

	if (arrays[j] > arrays[j+1]) {
	target = arrays[j];
	arrays[j] = arrays[j+1];
	arrays[j+1] = target;
   }	
  }
}
for (int count : arrays){
System.out.print(count + " ");

  }
 }
}