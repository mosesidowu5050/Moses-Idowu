class Solution16 {
    public static int threeSumClosest(int[] nums, int target) {

    int temp = 0;

for (int i = 0; i < nums.length; i++){
for (int j = i+1; j < nums.length; j++){
for (int k = j+1; k < nums.length; k++){
	if (nums[i] + nums[j] + nums[k] == target || nums[i] + nums[j] + nums[k] >= target){
		temp = nums[i] + nums[j] + nums[k];
          }
      }
   } 
}
return temp;

}

public static void main(String[] args){
int[] nums = {-1, 2, 1, -4};
int target = 1;

int results = threeSumClosest(nums, target);
System.out.print(results);

    }
}