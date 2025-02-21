public class CodeWarCalcu{

public static int SumOfLists(int[] lists){
	int sum = lists[0];

int largest = 0;
for (int c = 0; c < lists.length; c++){
	sum += lists[c];
	if(lists[c] > largest){
	 largest = lists[c];
}
return largest;
}
  return sum;
}

public static void main(String... md){
int[] lists = {1, 2, 3, 4, 5};
System.out.println("For-loop Sum Is: " + SumOfLists(lists));
System.out.println("Largest Is: " + SumOfLists(lists));

  }
}