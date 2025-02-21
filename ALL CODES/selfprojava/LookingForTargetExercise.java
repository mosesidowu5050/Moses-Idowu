class LookingForTargetExercise{
	public static void main(String[] args){

int[] lists = {1, 2, 3, 4, 5, 6, 7, 8};

System.out.print(searchForATargetInTheArray(lists));
}

public static int searchForATargetInTheArray(int[] lists){

	int target = 5;
	int arrray = lists.length;

	for(int c = 0; c < lists.length; c++){
		if(lists[c] == target){
		return c;
	   }
	}
	return -1;
   }
}


//int input = 5;
//int[] lists = {1, 2, 3, 4, 5, 6, 7, 8};
//int[] result = searchForATargetInTheArray(lists, input);
//System.out.print(result);