import java.util.ArrayList;

public class ArrayKata{
    public static int lists[] = { 23, 324, 65, 84, 9 };
    public static double numbers[] = { 23, 324, 65, 84, 9 };

	static int getMinimum(int[] lists){
	int min = lists[0];

	for (int a = 1; a < lists.length; a++){
	if (lists[a] < min){
	min = lists[a];
    }
  }
        return min;
}
	static int getMaximum(int[] lists){
	int max = lists[0];

	for(int b = 1; b < lists.length; b++){
	if (lists[b] > max){
	max = lists[b];
   } 
 }
	return max;
}
	public static int getSum(int[] lists){
	int sum = lists[0];

	for(int c = 1; c < lists.length; c++){
		sum += lists[c];
}
	return sum;
}

static int sumOfEvenNumber(int[] lists){
    int evenNumber = 0;

    for (int d = 0; d < lists.length; d++){
        if (lists[d] % 2 == 0){
            evenNumber += lists[d];

        }
    }
    return evenNumber;
}

static int sumOfOddNumber(int[] lists){
    int oddNumber = 0;
    
    for (int e = 0; e < lists.length; ++e){
        if (lists[e] % 2 != 0){
            oddNumber += lists[e];
        }
    }  
        return oddNumber;
}

static int numberOfOld(int[] lists){
    int numOfOdd = 0;

    for (int f = 0; f < lists.length; ++f){
        if(lists[f] % 2 != 0){
            numOfOdd++;
        }
    }
    return numOfOdd;
}

static int numberOfEven(int[] lists){
    int numOfEven = 0;

    for (int g = 0; g < lists.length; ++g){
        if(lists[g] % 2 == 0){
            numOfEven++;
        }
    }
    return numOfEven;
}
static ArrayList<Integer> evenNumbersIn(int[] lists){
    ArrayList<Integer> evenNumbers = new ArrayList<>();

    for ( int h = 0; h < lists.length; ++h){
        if(lists[h] % 2 == 0){
            evenNumbers.add(lists[h]);
        }
    }
    return evenNumbers;
}

static ArrayList<Integer> oddNumbersIn(int[] lists){
    ArrayList<Integer> oddNumbers = new ArrayList<>();

    for ( int i = 0; i < lists.length; ++i){
        if(lists[i] % 2 != 0){
            oddNumbers.add(lists[i]);
        }
    }
    return oddNumbers;
}

 static ArrayList<Double> squarringNum(double[] numbers){
    ArrayList<Double> getSquare = new ArrayList<>();
    
    for (int k = 0; k < numbers.length; ++k){
        getSquare.add(Math.pow(numbers[k], 2)); 
    }
    return getSquare;
}

public static void main(String[] args){

	System.out.println("\nLargest Is: " + getMaximum(lists));
    System.out.println("Smallest Is: " + getMinimum(lists));
	System.out.println("Sum Is: " + getSum(lists));
    System.out.println("Sum Of Even Number Is: " + sumOfEvenNumber(lists));
    System.out.println("Sum Of Odd Number Is: " + sumOfOddNumber(lists));
    System.out.println("Number Of Odd Is: " + numberOfOld(lists));
    System.out.println("Number Of Even Is: " + numberOfEven(lists));
    System.out.println("Even Numbers In The Array Are: " + evenNumbersIn(lists));
    System.out.println("Odd Numbers In The Array Are: " + oddNumbersIn(lists));
    System.out.printf("Square Of All Numbers: " + " " + squarringNum(numbers));

    }
}