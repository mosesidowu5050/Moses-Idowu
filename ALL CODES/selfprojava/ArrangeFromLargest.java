import java.util.*;

class ArrangeFromLargest {
	public static void main(String[] args){

int[] bags = {65, 8, 12, 77, 2};
int temp = 0;
int savings = 0;

for (int i = 0; i < bags.length; i++){
for (int j = 0; j < bags.length-1; j++){
int largest = j;
int smallest = j;

	if (bags[j] > bags[j+1]){
	temp = bags[j];
	bags[j] = bags[j+1];
	bags[j+1] = temp;	

          }
     }
}
System.out.print(Arrays.toString(bags));

for (int i = 0; i < bags.length; i++){
for (int j = 0; j < bags.length-1; j++){
int largest = j;
int smallest = j;
	if (bags[largest] > bags[smallest+1]){
	savings = bags[largest];
	bags[largest] = bags[smallest+1];
	bags[smallest+1] = savings;	
     }
   }
}

System.out.println();
System.out.print(Arrays.toString(bags));

     }
}

