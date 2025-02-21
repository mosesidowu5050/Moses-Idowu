import java.util.Arrays;

class RemovingDuplicatesInAnArray {
   public static void main(String[] args){

int[] nums = {2, 2, 1};

int[] result = getDuplicateNumbers(nums);

    System.out.print("Uniques Numbers Are: " + " [");
for (int count = 0; count < result.length; count++){
    System.out.print(result[count]);
  if (count < result.length - 1){
    System.out.print(", ");
    }
  }
    System.out.print("] ");
}


public static int[] getDuplicateNumbers(int[] nums){

Arrays.sort(nums);

int count = 0;
int[] duplicates = new int [nums.length];

for (int check = 0; check < nums.length; check++){
Boolean ifItIsDuplicates = false;

for (int counter = 0; counter < count; counter++){
    if (duplicates[counter] == nums[check]){
      ifItIsDuplicates = true;
        break;
  }
}
     if(!ifItIsDuplicates){
        duplicates[count++] = nums[check];
   }
}

int[] storingDuplicates = new int [count];
    
for (int counter = 0; counter < count; counter++){
       storingDuplicates[counter] = duplicates[counter];
   }

     return storingDuplicates;
  }  
}