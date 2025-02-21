/*
write a function that prints the elements on odd positions in a list.
*/

import java.util.Arrays;

class OddPosition {
    public static int[] getOddPosition (int[] nums){

int temp = 0;
int[] count = new int[temp];

for (int odd = 0; odd < nums.length-1; odd++){
      if (nums[odd] % 2 == 0){
         temp ++;
count[temp] = odd;
 }
}
return count;
}

    public static void main (String[] args){
int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

int[] result = getOddPosition(nums);
System.out.print(Arrays.toString(result));

   }
}