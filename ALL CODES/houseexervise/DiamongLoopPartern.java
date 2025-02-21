class DiamongLoopPartern {
   public static void main(String[] args){

int nums = 11;
int nums2 = 8; 
int i = 50;


for (int starts = 1; starts < nums; starts++){
   for (int ends = starts; ends < nums2; ends = ends+2){
      System.out.print(" ");
  }
for (int rolling = 0; rolling < starts; rolling++){
   if (starts % 2 == 1)
System.out.print("*");
}
System.out.println();
}

for (int start = 1; start < nums2; start++){
   for (int end = 0; end < start; end = end+2){
       System.out.print(" "); 
  }
for (int rolling = start; rolling < nums2; rolling++){
   if (start % 2 == 1)
     System.out.print("*");
  }
System.out.println();
}


   }
}