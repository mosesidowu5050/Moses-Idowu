class ArrayNumberPattern {
   public static void main(String[] args){

int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int size = nums.length;

for (int i = 0; i <= size; i++) {
  for (int j = i; j <= size; j++) {
    for (int k = j; k <= size-1; k++) {
      System.out.print(nums[k]);
}

System.out.println();
} 

System.out.println();
}


   }
}

/*
i = 1... 
i = 2... 
i = 3... 
i = 4... 
i = 5...
*/