/*

7.12 (Duplicate Elimination) Use a one-dimensional array to solve the following problem: Write an application that inputs ten numbers, each between 10 and 100, both inclusive. Save each number that was read in an array that was initialized to a value of -1 for all elements. Assume a value of -1 indicates an array element is empty. You are then to process the array, and remove duplicate elements from the array containing the numbers you input. Display the contents of the array to demonstrate that the duplicate input values were actually removed. [Note: do not display the array elements where the value is -1.]

*/

import java.util.Scanner;

class DuplicateElimination {
    public static void main(String[] args){

Scanner input = new Scanner(System.in);

int[] numbers = new int[10];
int counter = 0;

  System.out.print("Enter ten numbers between (10 and 100): "); 
for (int count = 0; count < 10; count++){
     int inputNumber = input.nextInt();

while (inputNumber < 10 || inputNumber > 100){
    System.out.print("Invalid, enter numbers between (10 and 100): ");
          inputNumber = input.nextInt();
}

boolean IfItIsDuplicate = false;

for (int element = 0; element < counter; element++){
   if (numbers[element] == inputNumber){
     IfItIsDuplicate = true;
       break;
   }
}
   if(!IfItIsDuplicate){
       numbers[counter++] = inputNumber;
  }
}

  System.out.print("Unique Numbers Are: " + " [");
for (int element = 0; element < counter; element++){
  System.out.print(numbers[element]);
    if (element < counter - 1) {
       System.out.print(", ");
  }
}
  System.out.print("]");

  }
}