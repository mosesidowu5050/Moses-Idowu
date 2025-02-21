class FindMostFrequentlyOccuringNumber {
    public static void main(String[] args){

int[] nums = {4, 2, 4, 5, 6, 4, 2, 2, 2};
int maxCount = 0;
int mostOccuring = nums[0];

for (int firstNumber = 0; firstNumber < nums.length; firstNumber++){
      int count = 0; // accept the first number 4
   for (int checking = 0; checking < nums.length; checking++){
          
        if (nums[firstNumber] == nums[checking]){
            count++; // if 4 is the same as 4 increase count
         
     }
  }

// checking the most occuring number inside the outerloop
       if (count > maxCount){
            maxCount = count;
            mostOccuring = nums[firstNumber];
      }
}
 System.out.println("Most Occuring Number is: " + mostOccuring);

   }
}