public class ListingMaths{

static int[] lists =  {1, 20, 45, 344, 57, 9, 40, 7};

int c;

static int getMinimum(int[] lists){
	int minimum = lists[0];
	
	for (int list : lists){
	if (list < minimum) minimum = list;


}
return minimum;
}

static int getLargest(int[] lists){
	int largest = lists[0];
for (int a = 0; a < lists.length; a++){
	if (lists[a] > largest) largest = lists[a];

  }
return largest;
}

static int[] MaxAndMin(int[] lists){
int maxi = lists[0];
int mini = lists[0];

for(int c = 0; c < lists.length; c++){
	if (lists[c] > maxi) maxi = lists[c];
	if (lists[c] < mini) mini = lists[c];

  }
return new int[] {maxi, mini};
}

static int getSumming(int[] lists){
int sum = 0;

for(int b = 0; b < lists.length; b++){
	sum += lists[b];
  }
return sum;
}

static int getEvenSum(int[] lists){
int evenSum = 0;
int total = 0;

for (int d = 0; d < lists.length; d++){
	if (lists[d] % 2 == 0){
	evenSum += lists[d];

  }
}
return evenSum;
}

static int getNoOfOld(int[] oddy){
	int oddNumbers = 0;
for (int t = 0; t < oddy.length; t++){
	if (oddy[t] % 2 != 0){
	oddNumbers++;
  }
}
return oddNumbers;
}

public static void main(String[] args){

int[] minimaxi = MaxAndMin(lists);

System.out.print("The minimum is: " + getMinimum(lists));
System.out.print("\nThe maximum is: " + getLargest(lists));
System.out.print("\nThe Maximum and Minimum is: " + "{" + minimaxi[0] + ", " + minimaxi[1] + "}");
System.out.print("\nThe sum is: " + getSumming(lists));
System.out.print("\nThe Sum Of Even is: " + getEvenSum(lists));
System.out.print("\nThe Odd Numbers are: " + getNoOfOld(lists));



  }
}