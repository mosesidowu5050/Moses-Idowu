public class ForLoop{
public static void main(String[]args){

int total = 0;
int total2 = 0;
int counts = 2;
int count = 3;
int sum;

	for (count = 3; count <= 10; count++){
	for (counts = 2; counts <= count; counts++);
	System.out.println(count);
	System.out.println(counts);
	total1 += count;
	total2 += counts;
	
}
sum = total1 + total2;	
System.out.println("Sum is: " + sum);

	//for (int j = 2; j >= 20; j -= 2){
	//System.out.println(j);
//}

	//for (int counter = 4; counter <= 15; counter = counter+4){
	//System.out.println(counter);
	//	total2 += counter;
//}
//System.out.println("Sum of the integer is: " + total2);

}

}