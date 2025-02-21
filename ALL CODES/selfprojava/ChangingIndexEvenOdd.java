class ChangingIndexEvenOdd {
	private static int[] getTheEvenOddAndExchangePosition(int[] arrays){

int evenInput = -1;
int oddInput = -1;
int original = 0;

for (int c = 0; c < arrays.length; c++){
	if(arrays[c] % 2 == 0 && evenInput == -1){
	evenInput = c;
	}
	if(arrays[c] % 2 != 0 && oddInput == -1){
	oddInput = c;
	}
	
	if (evenInput != -1 && oddInput != -1){
	original = arrays[evenInput];
	arrays[evenInput] = arrays[oddInput];
	arrays[oddInput] = original;
	
	 evenInput = -1;
	oddInput = -1;

for(int j = c+1; j < arrays.length; j++){
	if(arrays[j] % 2 == 0 && evenInput == -1){
	evenInput = j;
	}
	if(arrays[j] % 2 != 0 && oddInput == -1){
	oddInput = j;
	     }
	   }
	  }
	}
	
 	return arrays;
}

public static void main(String[] args){

int[] arrays = {5, 6, 7, 8};

int[] results = getTheEvenOddAndExchangePosition(arrays);

for (int nums : results){
System.out.print(nums);

}
   }
}