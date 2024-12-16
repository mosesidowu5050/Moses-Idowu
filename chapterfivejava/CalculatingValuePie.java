public class CalculatingValuePie{
public static void main(String[] args){

double pie = 0;

for(double counter = 1; counter <= 200.00; counter = counter+ 200.00){
	pie = 4 - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + (4/13) - (4/15) + (4/17) - (4/19) + (4/21);

}
System.out.println(pie);

	}
}


//5.20 (Calculating the Value of π) Calculate the value of π from the infinite series.
//Print a table that shows the value of π approximated by computing the first 200,000 //terms of this series. How many terms do you have to use before you first get a value //that begins with 3.14159?