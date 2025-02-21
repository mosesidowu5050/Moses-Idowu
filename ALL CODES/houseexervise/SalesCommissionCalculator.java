import java.util.Scanner;

class SalesCommissionCalculator {
   public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("How many salespeople are you calculating for? : ");
int salesPeople = scan.nextInt();

int itemsSold = 0;
int itemsValues = 0;
int salesPersonsEarnings = 0;

int [][] salesPersonRecorder = new int [salesPeople][];
double [] savingPersonsEarnings = new double [salesPeople];


for (int row = 0; row < salesPeople; row++){
salesPersonsEarnings = 0;
String numberCount = " "+ (row+1);
   System.out.print("How many items were sold by Sales Person" + numberCount + ": ");
   itemsSold = scan.nextInt();
      salesPersonRecorder[row] = new int [itemsSold];

for (int countItems = 0; countItems < itemsSold; countItems++){
String numberCount2 = " " + (countItems+1);
   System.out.print("Enter the amount of item" + numberCount2 + ": ");
     salesPersonRecorder[row][countItems] = scan.nextInt();; 
        salesPersonsEarnings += salesPersonRecorder[row][countItems];
   }

double commision = 0.09;
double weeklyBonus = 200;
double salesPersonsPayment = (commision * salesPersonsEarnings) + weeklyBonus ;
savingPersonsEarnings[row] = salesPersonsPayment;

}

for (int row = 0; row < salesPersonRecorder.length; row++){
System.out.println();
   System.out.print("Sales Person " + (row+1) + " Sold Products amounts: ");

 for (int countItems = 0; countItems < salesPersonRecorder[row].length; countItems++){
System.out.print(salesPersonRecorder[row][countItems] + " ");

  }
System.out.println();

}


for (int checking = 0; checking < salesPeople; checking++){
  System.out.println("Sales Person" + (checking + 1) + " " + "Earning Is " + ": " + savingPersonsEarnings[checking]);
}
  


  }
}


//$200 per week + 9% = 9/100 = 0.09 x $350.89 = 31.5 + 200 = $231.5801
