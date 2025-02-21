import java.util.Scanner;

public class BackToSenderLogisticsService {
  
     static int ridersOneWage(int option1){
        int amountPerParcel = 500, basePay = 5000; int total = 0;
        
        if (option1 <= 50) {
            total = (option1 * amountPerParcel) + basePay;
                   
        }
        return total;
    }

     static int ridersTwoWage(int option2){
        int amountPerParcel = 500, basePay = 5000; int totalOne = 0;

        if (option2 >= 50 && option2 <= 59){
            totalOne = (option2 * amountPerParcel) + basePay;
        }
        return totalOne; 
    }

    static int ridersThreeWage(int option3){
        int amountPerParcel = 500, basePay = 5000; int totalTwo = 0;

        if (option3 >= 60 && option3 <= 69){
            totalTwo = (option3 * amountPerParcel) + basePay;
        }
        return totalTwo; 
    }

    static int ridersFourWage(int option4){
        int amountPerParcel = 500, basePay = 5000; int totalThree = 0;

        if (option4 >= 70){
            totalThree = (option4 * amountPerParcel) + basePay;
        }
        return totalThree; 
    }
    public static void main(String[] args) {
        
    //while (true) {
        System.out.println("\nBack To Sender Logistics Services...");
        int option1 = 28; int option2 = 55; int option3 = 68; int option4 = 90;

        int totalPayOne = ridersOneWage(option1);
        System.out.printf("%s\t%d\n", "First Rider's Payment at the close of the day is: ", totalPayOne);
        System.out.printf("%d%s%d\n", option1, "(successful delivery) x 160(Amount Per Parcel) + 5,000(BasePay) = ", totalPayOne);


        int totalPayTwo = ridersTwoWage(option2);
        System.out.printf("\n%s\t%d\n", "Second Rider's Payment at the close of the day is: ", totalPayTwo);
        System.out.printf("%d%s%d\n", option2, "(successful delivery) x 160(Amount Per Parcel) + 5,000(BasePay) = ", totalPayTwo);

        int totalPayThree = ridersThreeWage(option3);
        System.out.printf("\n%s\t%d\n", "Third Rider's Payment at the close of the day is: ", totalPayThree);
        System.out.printf("%d%s%d\n", option3, "(successful delivery) x 160(Amount Per Parcel) + 5,000(BasePay) = ", totalPayThree);

        int totalPayFour = ridersFourWage(option4);
        System.out.printf("\n%s\t%d\n", "Fourth Rider's Payment at the close of the day is: ", totalPayFour);
        System.out.printf("%d%s%d\n", option4, "(successful delivery) x 160(Amount Per Parcel) + 5,000(BasePay) = ", totalPayFour);

      }
        
    }
