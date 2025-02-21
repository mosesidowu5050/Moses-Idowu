class CheckIfArrayIsSorted {
    public static void main(String[] args){

int[] nums = {1, 3, 2, 4, 5};
boolean sorted = true;

for (int firstCheck = 0; firstCheck < nums.length; firstCheck++){
  for (int secondCheck = firstCheck+1; secondCheck < nums.length; secondCheck++){

     if (nums[firstCheck] > nums[secondCheck]){
         sorted = true;
      } else {
             sorted = false;
break;
      }
  }
}

if (sorted){
 System.out.println("Array is sorted");

} else {
System.out.println("Array is not sorted");
}


  }
}