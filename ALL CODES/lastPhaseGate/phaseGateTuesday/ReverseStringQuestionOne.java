import java.util.Scanner;

class ReverseStringQuestionOne{
public static String getSubstring(String words){
	
	String reverse = " ";
		
	 for(int count = words.length()-1; count >= 0; count--){
          
				reverse = reverse + words.charAt(count);
            }
	
	return reverse;
}


public static void main(String[]args){
 
System.out.print(getSubstring("ABCD") + " ");

	}
}