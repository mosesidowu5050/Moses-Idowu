	public class CodeWar{

	public static int[] ages = {2563, 293, 62, 723, 9489};

	public static int moses() {
	int largest = ages[0];


	for(int counter = 1; counter < ages.length; counter++){
		if (ages[counter] > largest){
		largest = ages[counter];
}

}
	return largest;

}
	public static void main(String[] args){

	System.out.println("Largest Is: " + moses());


	}

}