class FindEvenNumberInArrayMatrix {
    public static void main(String[] args){

int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
};

for (int firstIndex = 0; firstIndex < matrix.length; firstIndex++){
  for (int checking = 0; checking < matrix[firstIndex].length; checking++){

     if (matrix[firstIndex][checking] % 2 == 0){ //&& matrix[firstIndex] % 2 == 0){
          System.out.print(matrix[firstIndex][checking] + " ");
      }

  }
}


  }
}