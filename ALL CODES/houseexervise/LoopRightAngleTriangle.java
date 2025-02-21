class LoopRightAngleTriangle {
   public static void main(String[] args){

int nums = 7;

for (int row = 1; row < nums; row++){
   for (int column = row; column < nums; column++){
System.out.print(" ");
  }
for (int looping = 1; looping < row; looping++){
System.out.print("* ");
   }
System.out.println();
}


  }
}