import java.util.Arrays;

class PrintingAndRemovingTheDuplicatesNumber {
    public static void main(String[] args){

int[] nums = {1, 2, 2, 3, 4, 4, 5};

int count = 0;
int[] newArray = new int[nums.length];

for (int start = 0; start < nums.length-1; start++){
     if (nums[start] != nums[start+1]){
       newArray[count++] = nums[start];
  }
}
newArray[count++] = nums[nums.length-1];

   System.out.print("Unique Numbers Are" + " ["); 
for (int check = 0; check < count; check++){
   System.out.print(newArray[check] + ", ");
   
    }
   System.out.print(" ]"); 

  }
}