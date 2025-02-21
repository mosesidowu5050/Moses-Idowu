import java.util.*;

class Solution18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {

    int temp = 0;
	
	List<List<Integer>> sumOfFour = new ArrayList<>();
 
for(int i = 0; i < nums.length; i++){
for(int j = i+1; j < nums.length; j++){
for(int k = j+1; k < nums.length; k++){
for(int l = k+1; l < nums.length; l++){

    if (i != j && i != k && j != k && k != l && nums[i] + nums[j] + nums[k] + nums[l] == target){
	sumOfFour.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
	}
          }
       }
    }
}
    return sumOfFour;

}

public static void main(String[] args){
int[] nums = {2, 2, 2, 2, 2};
int target = 8;

List <List<Integer>> results = fourSum(nums, target);
System.out.print(results);

    }
}