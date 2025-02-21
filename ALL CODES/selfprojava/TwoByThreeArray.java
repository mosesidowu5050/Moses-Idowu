import java.util.Scanner;

class TwoByThreeArray{
	public static void main(String[] args){

Scanner reader = new Scanner(System.in);
	
int[][] t = new int[2][3];

//t have 2 rows
//t have 3 columns
//t have 6 elements

//row1 acces expression.. (0,0) (0,1) (0,2) 
//column2 acces expression.. (0,1) (1,1)

t[0][0] = 2;
t[0][1] = 3;
t[0][2] = 4;

t[0][1] = 1;
t[1][1] = 5;

t[0][1] = 0;
System.out.print(t[0][2]);

t[0][0] = 0;
t[0][1] = 0;
t[0][2] = 0;

t[1][0] = 0;
t[1][1] = 0;
t[1][2] = 0;


for (int c = 0; c < t.length; c++){
	for(int j = 0; j < t[c].length; j++){
	System.out.print(t[c][j] + " ");
	}
System.out.println();
}

for (int c = 0; c < t.length; c++){
	for (int j = 0; j < t[c].length; j++){
		System.out.print("Enter the values for t array: ");
		t[c][j] = reader.nextInt();
	}
System.out.println();
}
for (int c = 0; c < t.length; c++){
	for(int j = 0; j < t[c].length; j++){
	System.out.print(t[c][j] + " ");
	}
System.out.println();
}

for (int num[] : c){
	int smallest = 0;
	for (int nums : num){
	if (nums < smallest) smallest = nums;
	}
System.out.println("Smallest Is: " + smallest);

}


	}
}