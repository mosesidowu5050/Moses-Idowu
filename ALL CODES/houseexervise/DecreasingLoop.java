class DecreasingLoop {
   public static void main(String[] args){

for (int starts = 1; starts <= 6; starts++){
System.out.print("  ");
   for (int ends = 6; ends >= starts; ends--){
System.out.print("*");
    }
System.out.println();
}

   }
}