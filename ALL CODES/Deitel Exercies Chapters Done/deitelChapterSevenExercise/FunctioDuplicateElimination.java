/*

7.12 (Duplicate Elimination) Use a one-dimensional array to solve the following problem: Write an application that inputs ten numbers, each between 10 and 100, both inclusive. Save each number that was read in an array that was initialized to a value of -1 for all elements. Assume a value of -1 indicates an array element is empty. You are then to process the array, and remove duplicate elements from the array containing the numbers you input. Display the contents of the array to demonstrate that the duplicate input values were actually removed. [Note: do not display the array elements where the value is -1.]

*/

import java.util.Scanner;

class FunctioDuplicateElimination {
   public static void main(String[] args){

Scanner scan = new Scanner(System.in);

int[] nums = new int[10];

System.out.println("Inputs ten numbers between 10 and 100: ");

for (int count = 0; count < 10; count++){
     nums[count] = -1;
}

for (int count = 0; count < 10; count++){
   int inputNumber = scan.nextInt();
     nums[count] = inputNumber;
}

int[] result = getTheDuplicateElimination(nums);

    System.out.print("Uniques Numbers: " + " [");
for (int getNumbers = 0; getNumbers < result.length; getNumbers++){
    System.out.print(result[getNumbers]);

      if (getNumbers < result.length-1){
       System.out.print(", ");
    }
  }
    System.out.print("] ");
}


public static int[] getTheDuplicateElimination(int[] nums){

int[] duplicates = new int[nums.length];
int check = 0;

for (int count = 0; count < nums.length; count++){
   Boolean ifItIsDuplicates = false;

for (int counter = 0; counter < check; counter++){
   if (nums[count] == nums[counter]){
      ifItIsDuplicates = true;
        break;
   }
  }
    if (!ifItIsDuplicates){
       duplicates[check++] = nums[count];
 }
}
  int[] uniquesElements = new int[check];
for (int count = 0; count < check; count++){
   uniquesElements[count] = duplicates[count];
}
     return uniquesElements;
  }

}