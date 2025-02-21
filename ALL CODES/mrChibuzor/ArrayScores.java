	public class ArrayScores{
	public static void main(String[] args){
	
	int[] scores = {12, 11, 69, 456, 79, 10};
	int[] anotherScores = {29, 58, 20, 17, 44, 19};

	int total = 0;

for(int j = 0; j < scores.length; j++){
	//scores = anotherScores;
	//System.out.println(anotherScores[j]);
}
for(int num : scores){
	total += num;
	System.out.println("Total is: " + total);
}


//if (scores[0] > scores[4]){
//	System.out.println(scores[0]);
//} else {
//	System.out.println(scores[4]);
//}
	

	//anotherScores[5] = 50;
	//System.out.print(anotherScores[5]);

//for(int i = 0; i < anotherScores.length; i++){
//	scores = anotherScores;
//	System.out.println(scores[i]);
//	scores[2] = scores[3] + anotherScores[4];
//}
//	System.out.println(scores[2]);

	}



}