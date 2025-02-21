import java.util.Scanner;

public class ArrayDistri{
public static void main(String[] args){

Scanner reader = new Scanner(System.in);


int row;
int col;
double total = 0; 
double average = 0;
int position = 0;
int firstPosition = 0;
int secondPosition =0;

System.out.print("""
	\nLAGBAJA SCHOOLS GRADEBOOK
Enter the numbers of the students: 
""");
int noOfStudents = reader.nextInt();

while (noOfStudents <= 0){
System.out.print("Invalid number... How many students are they?: ");
noOfStudents = reader.nextInt();
}

System.out.print("How many subjects do they offer ?: ");
int noOfSubjects = reader.nextInt();

while (noOfSubjects <= 0){
System.out.print("Invalid number... How many subjects do they offer?: ");
noOfSubjects = reader.nextInt();
}

System.out.print("""
Saving>>>>>>>>>>>>>>>>>
Saved successfully
""");


double [][] array = new double [noOfStudents][noOfSubjects];

for(row = 0; row < array.length; row++){
for (col = 0; col < array[row].length; col++){
System.out.print("\nEntering score for student " + (row + 1) + ": ");
System.out.print("\nKindly, Enter score for subject " + (col + 1) + ": ");

array[row][col] = reader.nextDouble();

while(array[row][col] < 0 || array[row][col] > 100 ){
System.out.print("Invalid number... Enter the correct scores of the student: ");
array[row][col] = reader.nextDouble(); 
}

System.out.print("""
Saving>>>>>>>>>>>>>>>>>
Saved successfully
""");

 }
}


System.out.print("\nSUBJECT" + "\t");
for (col = 0; col < array[0].length; col++){
System.out.printf("\t%s%d", "SUB", (col + 1), ": " );
}
System.out.printf("\t%s\t%s\t%s", "TOTAL", "AVERAGE", "POSITION");



for (row = 0; row < array.length; row++){
System.out.print("\nStudent " + (row + 1) + ": ");
for (col = 0; col < array[0].length; col++){

total += array[row][col];
System.out.printf("%8s", array[row][col]);
}
average = total / array[0].length;
System.out.printf("\t%.2f\t%.2f", total, average);
  }



int [] studentsScores = new int [noOfStudents];

for (row = 0; row < noOfStudents; row++){
int score = 1;
for (col = 0; col < noOfStudents; col++){
if (studentsScores[row] < studentsScores[col]){
score++;
}
studentsScores[row] = score;
}
System.out.printf("\t%d", studentsScores[row]);
}
System.out.println();

  }
}

