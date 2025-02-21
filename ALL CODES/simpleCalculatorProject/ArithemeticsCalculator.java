import java.util.Scanner;

public class ArithemeticsCalculator {



//int collector;

	
	public int multiplyNumber(int numberOne, int numberTwo){
	
	int sumOfMultiply = numberOne * numberTwo;

return sumOfMultiply;
    
  }

	public int multiplyFeature(int scoreOne, int scoreTwo){

	int result = (int) Math.multiplyExact(scoreOne, scoreTwo);

return result;
}



public int summingNumbers(int numbers){

	Scanner reader = new Scanner(System.in);
int total = 0;

while(true){
	System.out.print("Enter numbers to get their sum(press 0 to display the sum: ");
	int collector = reader.nextInt();
	total += numbers;
if (collector == 0) break;
}

return total;
 
  }

}

