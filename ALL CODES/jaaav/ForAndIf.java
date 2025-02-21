import java.util.Scanner;

public class ForAndIf{
public static void main(String[] args){

Scanner r = new Scanner(System.in);

int sum = 0;
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;
int average = 0;

for(int count = 1; count <= 5; ++count){
	System.out.println("Enter scores: " + count 1);
	int scores = r.nextInt();
	
	sum += count;
	average = sum / 5;

if (scores < min){
	min = scores;
}

if (scores > max){
	max = scores;
}


}

System.out.println("Sum Is: " + sum);
System.out.println("Average Is: " + average);
System.out.println("Minimun Is: " + min);
SYstem.out.println("MAximum Is: " + max);
	}

}