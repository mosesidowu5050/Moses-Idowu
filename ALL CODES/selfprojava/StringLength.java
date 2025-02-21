import java.util.*;

class StringLength{
	public static String getStringLength(String s){

s = s.trim();

int length = 0;
int letters = s.length()-1;

while(letters >= 0 && s.charAt(letters) != ' ' ) {
	length++;
	letters--;
   }

	return length;
}

public static void main(String[] args){
Solution solution = new Solution();

String s = "Hello World";

System.out.println(getStringLength(s));
  }
}