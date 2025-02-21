import java.util.Scanner;

class ReverseStringQuestionTwo{
public static String getSubstring(String words){
	
	String reverse = " ";
		
	 for(int count = words.length()-1; count >= 0; count = count-1){
          
				reverse = reverse + words.charAt(count);
            }
	
	return reverse;
}


public static void main(String[]args){
 
System.out.print(getSubstring("how are you") + " ");

	}
}