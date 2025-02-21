public class ReturnArray {
    public static void main(String[] args) {
	
	int[] nums = {10, 2, 5, 6, 7};
	 
    int target = 7;
	   
	   for(int count = 0; count < nums.length; count++){
		   if(nums[0] == target){
			 	nums[0] = target;
	
	   }
  System.out.println(nums[0]);	   
	}		

     
    }
  
}

