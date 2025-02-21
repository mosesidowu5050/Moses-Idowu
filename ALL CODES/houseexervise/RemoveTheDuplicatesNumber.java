class RemoveTheDuplicatesNumber {
    public static void main(String[] args){

int[] nums = {1, 2, 2, 3, 4, 4, 5};
int size = nums.length;
int count = 0;

for (int start = 0; start < size; start++){
int counter = 0;
   for (int end = start+1; end < size; end++){
        if (nums[start] == nums[end]){
    for (int check = end; check < size-1; check++){    
           nums[check] = nums[check+1];
    }
      size--;
       end--;
   }
  }
}

for (int getValues = 0; getValues < size; getValues++){    
    System.out.print(nums[getValues] + " "); 
    
   }
  }
}