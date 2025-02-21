class ChangingTheIndexPosition{
	public static void main(String[] args){

int[] lists = {1, 2, 4};

int[] results = changeTheElementPosition(lists);
for (int num : results){
System.out.print(num + " ");

   }
}

public static int[] changeTheElementPosition(int[] lists){
 
int evenNum = -1;
int oddNum = -1;
int temp = 0;

	for(int c = 0; c < lists.length; c++){
	if (lists[c] % 2 == 0 && evenNum == -1){
	evenNum = c;
	}

	if (lists[c] % 2 != 0 && oddNum == -1){
	oddNum = c;
	   }
	}
	if (evenNum != -1 && oddNum != -1){
	temp = lists[evenNum];
	lists[evenNum] = lists[oddNum];
	lists[oddNum] = temp;
	
     }
	return lists;
  }
}