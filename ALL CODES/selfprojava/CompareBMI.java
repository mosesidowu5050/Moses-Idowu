/*
Mark and John are trying to compare their BMI (Body Mass Index), which is calculated 
using the formula: BMI = mass / height ** 2 = mass / (height * height). (mass in kg and height in meter).

1. Store Mark's and John's mass and height in variables
2. Calculate both their BMIs using the formula (you can even implement both versions)
3. Create a boolean variable 'markHigherBMI' containing information about whether Mark 
has a higher BMI than John.

TEST DATA 1: Marks weights 78 kg and is 1.69 m tall. John weights 92 kg and is 1.95 m tall.
TEST DATA 2: Marks weights 95 kg and is 1.88 m tall. John weights 85 kg and is 1.76 m tall.

GOOD LUCK 😀
*/


import java.util.Scanner;

class CompareBMI {
	public static double getFirstBmiResult (double mass, double height){

double bmi = 0;

return bmi = mass / (height * height);
}
	public static double getSecondBmiResult (double massTwo, double heightTwo){

double bmiTwo = 0;

return bmiTwo = massTwo / (heightTwo * heightTwo);
}


	public static void main(String[] args){

Scanner reader = new Scanner(System.in);


System.out.print("Enter Marks weights: ");
double mass = reader.nextDouble();

System.out.print("Enter Marks height: ");
double height = reader.nextDouble();


System.out.print("Enter John's weights: ");
double massTwo = reader.nextDouble();

System.out.print("Enter John's weights: ");
double heightTwo = reader.nextDouble();

boolean markHigherBMI = true;


double resultOne = getFirstBmiResult (mass, height);
double resultTwo = getSecondBmiResult (massTwo, heightTwo);



if (resultOne > resultTwo){
	System.out.println(markHigherBMI);
	System.out.printf("%s%.1f%s%.1f%s", "Mark's Body Mass Index (", resultOne,  ") is higher than John Body Mass Index(", resultTwo, ")");

} else {
	markHigherBMI = false;
	System.out.println(markHigherBMI);
	System.out.printf("%s%.1f%s%.1f%s", "John's Body Mass Index (", resultTwo, ") is higher than Mark Body Mass Index (", resultOne, ")");
}

   }
}