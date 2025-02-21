import java.util.*;

class Solution15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        
List <List<Integer>> sumThree = new ArrayList<>();

for (int i = 0; i < nums.length; i++){
for (int j = i+1; j < nums.length; j++){
for (int k =j+1 ; k < nums.length; k++){
	if (i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0){
	
	sumThree.add(Arrays.asList(nums[i], nums[j], nums[k]));
     }
   }
  }
}
return sumThree;
}


public static void main(String[] args){

int nums[] = {-1, 0, 1, 2, -1, -4};
List <List<Integer>> results =  threeSum(nums);
System.out.print(results);


    }
}