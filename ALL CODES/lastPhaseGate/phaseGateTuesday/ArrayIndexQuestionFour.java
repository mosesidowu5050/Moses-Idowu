class ArrayIndexQuestionFour {
	public static void main(String[] args){

int[][] arrays = {{1, 2, 3}, {4, 5, 6}};


System.out.print(getIndexNumber(arrays));

	}

		
	
	public static int[] getIndexNumber(int[][] arrays){

int target = 6;

for(int row = 0; row < arrays.length; row++){
	for(int column = 0; column < arrays[row].length; column++){
		if (arrays[row][column] == target){
			break;
		
		return arrays[row][column];	
	  }	
	}
  }
   	
 }
}