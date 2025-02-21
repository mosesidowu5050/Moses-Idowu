import java.util.Scanner;

class RequestCard {
	public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("Enter number of Students: ");
int noOfStudents = scan.nextInt();
System.out.println();
System.out.print("Enter number of Courses: ");
int noOfCourses = scan.nextInt();

int scores = 0;
int total = 0;

int[][] reportCard = new int[noOfStudents][noOfCourses];

for (int studentIndex= 0; studentIndex < reportCard.length; studentIndex++){
for (int courseIndex = 0; courseIndex < reportCard[studentIndex].length; courseIndex++){
	System.out.print("Enter Student "+(studentIndex+1) + " Course "+(courseIndex+1) + " score: ");
	scores = scan.nextInt();
	reportCard[studentIndex][courseIndex] = scores;
     }
}

for (int courseIndex = 0; courseIndex < noOfCourses; courseIndex++){
	System.out.printf("%18s", "Course " +(courseIndex + 1));
}
System.out.printf("%10s", "Total");
System.out.println();


for (int studentIndex = 0; studentIndex < reportCard.length; studentIndex++){
total = 0;
		System.out.print("Student "+(studentIndex + 1));

for (int courseIndex = 0; courseIndex < reportCard[studentIndex].length; courseIndex++){
	total += reportCard[studentIndex][courseIndex];
	int value = reportCard[studentIndex][courseIndex];
	System.out.printf("%12s", value);
   }
	System.out.printf("%12d", total);
	System.out.println();
}



     }
}

