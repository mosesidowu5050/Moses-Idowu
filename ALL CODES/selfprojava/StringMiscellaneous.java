import java.util.Arrays;

public class StringMiscellaneous {
	public static void main(String[] args) {

String s1 = "hello there";
char[] charArray = new char[11];

System.out.printf("%nLength of s1: %d%n", s1.length());

for (int i = s1.length()-1; i >= 0; i--){
	System.out.printf("%c ", s1.charAt(i));
}

	s1.getChars(0, 10, charArray, 0);
	System.out.println();

	for (char charact : charArray){
	System.out.printf("%s ", charact);
	
}

//s1.length();
//for(int j = s1.length()-1; j >= 0; j--);
//s1.charAt(i);




    }
}