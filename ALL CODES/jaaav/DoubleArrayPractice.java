public class DoubleArrayPractice{
public static void main(String[] args){

int[][] b = {{12, 15}, {15, 10,}, {11, 14}};
int[][] bb = {{2, 4, 6}, {8, 9}, {10, 12, 10}};

int sum1 = 0; int sum2 = 0; int total = 0; int average = 0;
int largest = 0; int largest2 = 0;

for(int row = 0; row < b.length; row++){
for(int column = 0; column < b[row].length; column++){
	sum1 += b[row][column];
	if (b[row][column] > largest)largest = b[row][column];
  }
}
for(int row2 = 0; row2 < bb.length; row2++){
for(int column2 = 0; column2 < bb[row2].length; column2++){
	sum2 += bb[row2][column2];
	if(bb[row2][column2] > largest2) largest2 = bb[row2][column2];
}
}
	total = sum1 + sum2;
	average = total / 14;
System.out.println("First Array Total Is: " + sum1);
System.out.println("First Largest Array Is: " + largest);
System.out.println("Second Array Total Is: " + sum2);
System.out.println("Second Largest Array Is: " + largest2);
System.out.println("Total Array Is: " + total);
System.out.println("The Average Of Array Is: " + average);
   }
}