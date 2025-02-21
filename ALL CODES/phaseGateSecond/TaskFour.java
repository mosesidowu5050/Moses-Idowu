public class TaskFour{

public static String getCharactersOccured(String[] arrays){

	String sum = " ";

	for (String array : arrays){
	if (array == "o"){
	sum += array;

  }
}
return sum;
}

public static void main(String[] args){

String [] arrays = {"Hello World"};


System.out.println("The Sum Is: " + getCharactersOccured(arrays));
  }
}