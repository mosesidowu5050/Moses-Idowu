class FindDuplicateNumber {
    public static void main(String[] args){

int[] nums = {4, 5, 6, 4, 7, 5};

for (int checkFirstIndex = 0; checkFirstIndex < nums.length; checkFirstIndex++){
   for (int checkSecondIndex = checkFirstIndex+1; checkSecondIndex < nums.length; checkSecondIndex++){

     if (nums[checkFirstIndex] == nums[checkSecondIndex]){
            System.out.print(nums[checkSecondIndex] + ", ");
      }

   }
}



   }

}

//check1 = 1
//check1 = 2