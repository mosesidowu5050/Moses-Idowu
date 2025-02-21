
class HighestStudentsQuest{
	public static void main(String[] args){

int[][] arrays = {{30, 40, 50}, 
	          {10, 20, 50}};

int highest = 0;
int lowest = 0;
int total = 0;
int column = 0;
int row = 0;

//int[][] newArrays = new int[1];

for (row = 0; row < arrays.length; row++){
	for (column = 0; column < arrays[0].length-1; column++){
	
			System.out.print(arrays[row][column] + " ");
	} 
	total += arrays[row][column];
	System.out.println(total);
	}

   }
}