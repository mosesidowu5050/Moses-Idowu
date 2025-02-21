class PairsThatMeetACondition {
    public static void main(String[] args){

int[] nums = {1, 2, 3, 4, 5, 6};
int target = 7;

for (int firstNum = 0; firstNum < nums.length; firstNum++){
   for (int secondNum = firstNum+1; secondNum < nums.length; secondNum++){

if (nums[firstNum] + nums[secondNum] == target){
         System.out.print("(" + nums[firstNum] + ", " + nums[secondNum] + ")");

   }
  }
System.out.println();
}


   }
}