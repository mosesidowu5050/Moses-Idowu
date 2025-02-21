public class MiniMaxiArrayPractice{
static int[][] b = {{12, 15}, {15, 10,}, {11, 14}};

static int getMaximum(){
	int max = b[0][0];

for(int[] row : b){
for(int column : row){
	if(column > max) max = column;

}
  }
	return max;
}
	
static int getMinimum(){
	int min = b[0][0];
for(int[] row2 : b){
for(int column2 : row2){
	if(column2 < min) min = column2;
	
}
}
	return min;
}


public static void main(String[] args){
System.out.println("Maximum Is: " + getMaximum());
System.out.println("Minimum Is: " + getMinimum());

  }

}