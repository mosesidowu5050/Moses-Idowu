class FindPairsWithGivenDifference {
    public static void main(String[] args){

int[] nums = {1, 5, 3, 9, 7};

int difference = 2;

for (int firstIndex = 1; firstIndex < nums.length; firstIndex++){
   for (int checkingIndex = 0; checkingIndex < nums.length; checkingIndex++){

      if (nums[firstIndex] - nums[checkingIndex] == difference){
      System.out.print("(" + nums[firstIndex] + ", " + nums[checkingIndex] + ")");
        }
  }
System.out.println();
}


   }
}
 