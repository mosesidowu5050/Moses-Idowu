class LoopUpsideDownTriangle {
  public static void main(String[] args){

int nums = 7;

for (int starts = 1; starts < nums; starts++){
  for (int ends = 1; ends < starts; ends++){
System.out.print(" ");
}
for (int triangle = starts; triangle < nums; triangle++){
System.out.print("* ");
  }
System.out.println();
}


  }
}