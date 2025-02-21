import java.util.*;

class Solution1 {

    public static int[] twoSum(int[] nums, int target) {

       int temp = 0;
    int tempTwo = 0;
    int count = 0;
    int[] num = new int[5];

     for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums.length-1; j++){
            if (nums[j] + nums[j+1] == target){
                //count++;
                temp = j;
                tempTwo = j+1;
                 //num[count] = temp + tempTwo;

            }
        }
     }   
     return new int[] {temp, tempTwo};
    }



public static void main(String[] args){
int[] nums = {3, 2, 4};
int target = 6;

int[] results = twoSum(nums, target);
System.out.print(Arrays.toString(results));

}
}