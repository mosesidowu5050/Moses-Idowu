public class RepeatedNumbers {
    public static void main(String[] args) {
	
	
	 int[] nums = {1, 2, 2, 2, 2, 4, 5};
	 
        System.out.println(findRepeatedValue(nums));
    }




    public static boolean findRepeatedValue(int[] nums) {
	
       int read = 0;
	   
	  while (nums == 4){
	   for(int count = 0; count < nums.length; count++){
		   if(nums[count] == nums[count+1]){
				
				
		   } else if (nums[count+1] == nums[count]){
			   
		   }
			   read++;
			  
		  }
	   }
	 }
		  
}

