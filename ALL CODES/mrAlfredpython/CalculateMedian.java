//input[10, 2, 38, 22, 38, 23]... [2, 10, 22, 23, 38, 38]
//median[30]

class CalculateMedian{
	public static void main(String[] args){

int[] arrays = {10, 2, 38, 22, 38, 23};

int sum = arrays.length;
int target = 0;
int mid1 = 22;
int mid2 = 23;
int temp = 0;
int stores = 0;

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

System.out.println();
for (int c = 0; c < sum; c++){
	for (int j = 0; j < sum-1; j++){

	if (arrays[j] == mid1){
	temp = arrays[j];
}	
	if (temp != mid2){
	stores = temp + mid2;
  }
}
System.out.print(temp + " ");

}

 }
}