import java.util.Arrays;

public class  medianArray{
public static void main(String[] args) {
	 int[] nums = {1,2,3};
	 int[] nums1 = {2,3,4};
		  
		  for (int value : nums){
		  System.out.print(value + " ");
		  }
			  for(int value1 : nums1){
				  System.out.print(value1 + " ");
			  }
		  
	 System.out.println("\nMedian of the said array of integers: " + getMedian(nums));
	 

	
}
 public static int getMedian(int[] array) {
	 if (array.length % 2 == 0) {
		 
		int mid = array.length / 2;
            return (array[mid] + array[mid - 1]) / 2;
        }
		
	  return array[array.length / 2];
	}
 }