import java.util.Arrays;

class Question3 {
    public static int getSingleIndex (int[] nums){

int[] singleIndex = new int[nums.length-1];
int temp = 0;
int count = 0;

for (int i : nums){
	temp = temp ^ i;
}
return temp;
}


    public static void main (String[] args){


int[] nums = {4, 1, 2, 1, 2};

int result = getSingleIndex(nums);
System.out.print(result);


   }
}

