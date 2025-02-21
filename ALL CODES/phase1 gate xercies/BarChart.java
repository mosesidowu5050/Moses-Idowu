 public class BarChart {
public static void main(String[] args) {

int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

int stars;
int counter;

for (counter = 0; counter < array.length; counter++) {

for (stars = 0; stars < array[counter]; stars++) {

System.out.print("*"); 
} 
System.out.println(); 
} 
System.out.println();

for (counter = 0; counter < array2.length; counter++){
for (stars = 0; stars < array2[counter]; stars++){

System.out.print("*");
}
System.out.println();
}

  }
}