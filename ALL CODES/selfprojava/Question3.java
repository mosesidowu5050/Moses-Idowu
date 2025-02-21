class Question3 {
	public static int getTheSingleOne(int[] nums){


int[] uniqueValue = nums.length;
int count = 0;

for (int i = 1; i < nums.length; i++){
uniqueValue = 0;
     for (int j = 0; j < nums.length; j++){
            if (nums[i] == nums[j]){
                count = nums[i];
                   

           }
      }
   }
return count;
}

public static void main(String[] args){

int[] nums = {2, 2, 1};

int result = getTheSingleOne(nums);

System.out.println(result);

   }
}

//i = 2
//j = 2
if 2 == 2
count = count - 2 =0;
count = count - 2 != 0;
print count


//2 = 2 then substract 2 from the list
// 1 != 2 then add 1 to the printed list;

