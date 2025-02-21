import java.util.Scanner;

class StudentGradesTest {
	public static void main(String[] args){

Scanner scan = new Scanner(System.in);

StudentGrades names = new StudentGrades ("Ajubewu Tope");

String letterGrades;
int aGrades = 0;
int bGrades = 0;
int cGrades = 0;
int dGrades = 0;
int fGrades = 0;
int total = 0;
int countGrades = 0;

for (int students = 0; students < 5; students++){ 
String counting = "student "+(students + 1);
System.out.print("Enter students " + counting + " grade: ");
int grades = scan.nextInt();
total += grades;
++countGrades;

switch (grades / 10){
case 9:
case 10:
     ++aGrades;
break;

case 8:
     ++bGrades;
break;

case 7:
     ++cGrades;
break;

case 6:
     ++dGrades;
break;

default:
   ++fGrades;
break;
   }
}

System.out.print(names.getName());

System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d", "THE FIVE STUDENTS GRADES RESULTS: ",
" Students got grade A : ", aGrades, " Students got grade B : ", bGrades, 
" Students got grade C : ", cGrades, " Students got grade D : ", dGrades,
" Students got grade F : ", fGrades);

if (countGrades != 0){
    double average = total / countGrades;
System.out.printf("%n%s%.2f"," Average Scores Is: ", average);
}
  }
}