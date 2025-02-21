public class ListRunningTotal{

static int[] list = {23, 35, 44, 65, 14};

static int runningTotal(){
	int total = list[0];

for(int counter = 0; counter < list.length; counter++){
	total += counter;	

}
	return total;
}


public static void main(String... md){

System.out.println(runningTotal());

   }
}