import java.util.Arrays;

class HighestStudentsQuestionFive{
	public static int[] getStudentsHighestScore(int[][] arrays ){

int total = 0;

int[] studentScores = new int[arrays[0].length];

	for (int row = 0; row < arrays.length-1; row++){
	for (int column = 0; column < arrays[row].length; column++){
		studentScores [column] += arrays[row][column];

	}	
          }

int highestStudent = 0;
int highestScore = studentScores[0];

	for (int row = 1; row < studentScores.length; row++){
	if (studentScores[row] > highestScore){
	highestSscore = row;
	
         }
      }

int highestStudent = 0;
int lowestScore = studentScores[0];

	for (int row = 1; row < studentScores.length; row++){
	if (lowestScores[row] > highestScore){
	highestStudent = row;
	highestScore = studentScore[row];
         }
      }
return new int[] {highestScore}
}


public static void main(String[] args){

int[][] arrays = {{30, 40, 50}, 
	          {10, 20, 50}};

int result[] = getStudentsHighestScore(arrays);

System.out.print(result);

   }
}