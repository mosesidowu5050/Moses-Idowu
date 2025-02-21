class FindTripletsSumOfATarget {
    public static void main(String[] args){

int[] nums = {1, 2, 3, 4, 5, 6};
int target = 10;

for (int starts = 0; starts < nums.length; starts++){
  for (int check = starts+1; check < nums.length; check++){
    for (int ends = check+ 1; ends < nums.length; ends++){
     if (nums[starts] + nums[check] + nums[ends] == target)
             
   System.out.print("[" + nums[starts] + ", " + nums[check] + ", " + nums[ends] + "]" + "\n");
      }
  } 
}


   }
}