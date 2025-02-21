/*
5.29 (“The Twelve Days of Christmas” Song) Write an application that uses iteration
 and switch statements to print the song “The Twelve Days of Christmas.” 
One switch statement should be used to print the day (“first,” “second,” and so on). 
A separate switch statement should be used to print the remainder of each verse.
Visit the website en.wikipedia.org/wiki/The_Twelve_Days_ of_Christmas_(song)
for the lyrics of the song. 
*/

import java.util.Scanner;

class TheTwelveDaysOfChristmasSong {
	public static void main(String[] args){

Scanner scan = new Scanner(System.in);

int i;
boolean keepLooping = true;


while (keepLooping){
System.out.print("Twelve Days Of Christmas: ");
int numbers = scan.nextInt();

switch(numbers){
    case 1:
       System.out.print("On The First Day Of Christmas");
    case 2:
      System.out.print("On The Second Day Of Christmas");
             
}
break;
}

   }
}