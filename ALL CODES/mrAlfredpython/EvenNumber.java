import java.util.Scanner;
import java.util.ArrayList;

class EvenNumber {

static boolean getEvenNumbers (int nums, ArrayList<Integer> evenNums ){
	if (nums % 2 == 0){
	evenNums.add(nums);
return true;
} 
	else {
	evenNums.add(nums);
 return false;
  }
}

static ArrayList<Integer> getEvenNums(ArrayList<Integer> evenNums, ArrayList<Integer> evenChecks){
int total = 0;
for (int c = 0; c < evenNums.size(); c++){
evenChecks.add(c);
total += evenNums.get(c);
	
   }
return evenChecks;
}
public static void main(String[] args){
	Scanner reader = new Scanner(System.in);

System.out.print("Enter numbers to check if its an even number: ");
int nums = reader.nextInt();

ArrayList<Integer> evenNums = new ArrayList<>();
ArrayList<Integer> evenChecks = new ArrayList<>();

System.out.print(getEvenNumbers(nums, evenNums));
System.out.print(getEvenNums(evenNums, evenChecks));


    }
}