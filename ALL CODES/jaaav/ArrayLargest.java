import java.util.*;

public class ArrayKata{
    public static int arr[] = { 10, 324, 45, 90, 9808 };

       static int getMinimum(){
           int min = arr[0];

           for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
    }
  }
        return min;
}

   public static void main(String[] args){

        System.out.println("Smallest Is " + getMinimum());
    }
}