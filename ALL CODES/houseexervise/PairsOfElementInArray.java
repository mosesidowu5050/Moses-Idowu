class PairsOfElementInArray {
   public static void main(String[] args){

int[] nums = {0, 1, 2, 3};

for (int firstValue = 0; firstValue < nums.length; firstValue++){
   for (int secondValue = 0; secondValue < nums.length; secondValue++){

      System.out.print("(" + nums[firstValue] + "," + nums[secondValue] + ")" + " ");

   }
System.out.println();
}



   }

}