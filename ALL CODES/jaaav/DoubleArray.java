public class DoubleArray{
public static void main(String[] args){

int[][] a = {{1, 2, 3}, {4, 5, 6}};
int[][] aa = {{7, 8}, {9}, {10, 11, 12}};

int total = 0; int total2 = 0; int overallTotal = 0;
int average = 0;

for(int row = 0; row < a.length; row++){
for(int column = 0; column < a[row].length; column++){
total += a[row][column];

  }
}
for(int row2 = 0; row2 < aa.length; row2++){
for(int column2 = 0; column2 < aa[row2].length; column2++){
	total2 += aa[row2][column2];
  }
}
	overallTotal = total + total2;
	average = overallTotal / 12;

System.out.println(total);
System.out.println(total2);
System.out.println("Overall Total of both array is: " + overallTotal);
System.out.println("Average of both array is: " + average);

   }
}