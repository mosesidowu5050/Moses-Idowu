public class ReturnArrayElements {
    public static void main(String[] args) {
	
	
	 int[] nums = {10, 2, 5, 6, 7};
	 
        System.out.println(arrayReturnNumber(nums));
    }




    public static int arrayReturnNumber(int[] nums) {
	
      int target = 7;
	   
	   for(int count = 0; count < nums.length; count++){
		   if(nums[count] == target){
			 	target = nums[count];
		   }	
			
			
			   return nums[count];
			  
		  }
	   }
	}
  
}

