/*
A small airline has just purchased a computer for its new automated 
reservations system. You’ve been asked to develop the new system.
You’re to write an application to assign seats on each flight (capacity 10seats)

Display the following: Please type 1 for First Class and Please type 2 for Economy. 
If the user types 1, your application should assign a seat in the firstclass section 
(seats 1–5). If the user types 2, your application should assign a seat in the 
economy section (seats 6–10).

Your application should then display a boarding pass indicating the person’s
seat number and whether it’s in the first-class or economy section of the plane.

Use a one-dimensional array of primitive type boolean to represent the seating chart 
of the plane. Initialize all the elements of the array to false to indicate that all the 
seats are empty. As each seat is assigned, set the corresponding element of the array 
to true to indicate that the seat is no longer available.

Your application should never assign a seat that has already been assigned. 
When the economy section is full, your application should ask the person 
if it’s acceptable to be placed in the first-class section (and vice versa). 
If yes, make the appropriate seat assignment. If no, display the message
"Next flight leaves in 3 hours.
*/

import java.util.Scanner;

class AirlineReservationsSystem {
	public static void main(String[] args){

Scanner me = new Scanner(System.in);

System.out.print("Please type 1 for First Class and Please type 2 for Economy Class: ");
int userChoice = me.nextInt();

final int ARRAY_LENGTH = 10;
int[] firstClass = {1, 2, 3, 4, 5};
int[] economyClass = {6, 7, 8, 9, 10};

int[] firstClassSeatBooked = new int [firstClass.length];
int[] economyClassSeatBooked = new int [economyClass.length];

int temp = 0;
int seatFirstClass = 0;

int count = 0;
int counter = firstClass.length-1;

for (int i = 0; i < firstClass.length; i++){
    if (userChoice == 1){
    System.out.println("A seat is assign in the firstclass section");
    temp = firstClass[i];
    firstClass[i] = firstClassSeatBooked[i];
    firstClassSeatBooked[i] = temp;

seatFirstClass = firstClassSeatBooked[i];  
   }
}
System.out.printf("%s%d%s", "Your seat number is ", seatFirstClass, " First Class Section Of The Plane");







    }
}