class CheckTheString {
	public static boolean checkingSubstring(String letterOne, String letterTwo){

int firstChar = 0;
int lastCharIndex = 0;

for(int count = 0; count < letterOne.length()-1; count++){
	for(int counter = 0; counter < letterTwo.length()-1; counter++){
	if (counter > lastCharIndex){

	if ((letterTwo.charAt(count) == letterOne.charAt(count))){
	firstChar++;
	lastCharIndex = counter;

	if (firstChar >= letterTwo.length()){


	}
         }
      }
   }
  }
return true;

}


	public static void main(String[] args){

String letterOne = "ABCD";
String letterTwo = "BDC";

Boolean results = checkingSubstring(letterOne, letterTwo);

System.out.print(results);

   }
}
