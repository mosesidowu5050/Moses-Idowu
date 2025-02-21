class CheckTwoArraysHaveCommonElement {
   public static void main(String[] args){

int[] arr1 = {1, 2, 3, 4, 5};
int[] arr2 = {6, 7, 8, 9, 5};

int count = 0;

for (int firstArray = 0; firstArray < arr1.length; firstArray++){
  for (int secondArray = 0; secondArray < arr2.length; secondArray++){
        if (arr1[firstArray] == arr2[secondArray]){
           System.out.print(arr1[firstArray]);
     }
  }
}


    }
}