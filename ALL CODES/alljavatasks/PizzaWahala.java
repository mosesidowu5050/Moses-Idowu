import java.util.Scanner;

public class PizzaWahala {
 public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);

    System.out.println("\n\tWELCOME TO IYA MOSES PIZZA JOINT AJEGUNLE\n");
    System.out.println("What would you like to order from us ?...");

  System.out.println("""
        
    PIZZA TYPE     |    NUMBER OF SLICES    |    PRICE PER BOX
1.  Sapa size               4                       2,500

2.  Small Money             6                       2,900

3.  Big Boys                8                       4,000

4.  Odogwu                  12                      5,200

0.  Order...

    """);

    int numberOfSapaSlices = 4; int numberOfSmallSlices = 6; int numberOfBigSlices = 8; int numberOfOdogwuSlices = 12;
    
    System.out.println("You can enter your choice of Pizza Type from (1 - 5) and (press 0 to order)...");
       int pizzatype = reader.nextInt(); 
    
       System.out.println("Enter the number of people you want to order for? ...");
       int noOfpeople = reader.nextInt();

    int numOfSapaBox = noOfpeople / numberOfSapaSlices;
    int numOfSmallBox = noOfpeople / numberOfSmallSlices;
    int numbOfBigBox = noOfpeople / numberOfBigSlices;
    int numberOfOdogwuBox = noOfpeople / numberOfOdogwuSlices;

    if (noOfpeople % 4 != 0) numOfSapaBox = numOfSapaBox + 1;
    if (noOfpeople % 6 != 0) numOfSmallBox = numOfSmallBox + 1;
    if (noOfpeople % 8 != 0) numbOfBigBox = numbOfBigBox + 1;
    if (noOfpeople % 12 != 0) numberOfOdogwuBox = numberOfOdogwuBox + 1;


    int leftover1 = numOfSapaBox * numberOfSapaSlices;
    int leftoverSapa = leftover1 - noOfpeople;

    int leftover2 = numOfSmallBox * numberOfSmallSlices;
    int leftoverSmall = leftover2 - noOfpeople;

    int leftover3 = numbOfBigBox * numberOfBigSlices;
    int leftoverBigBoys = leftover3 - noOfpeople;

    int leftover4 = numberOfOdogwuBox * numberOfOdogwuSlices;
    int leftoverOdogwu = leftover4 - noOfpeople;
    

    int sapa = 2500; int smallmoney = 2900; int bigboys = 4000; int odogwu = 5200;
    int sapaprice = sapa * numOfSapaBox; 
    int smallmoneyprice = smallmoney * numOfSmallBox;
    int bigboysprice = bigboys * numbOfBigBox;
    int odogwuprice = odogwu * numberOfOdogwuBox;


while (true){
    if (pizzatype == 1){
        System.out.printf("%s%1d%1s%1d%1s%1d%1s%1d%1s", "Number of boxes of pizza to buy = ", numOfSapaBox, " boxes. Sapa size contains ",  numberOfSapaSlices, " slices per box ",  numOfSapaBox,  " boxes should be sufficient for ", noOfpeople, " people ");
        System.out.println("\nNumber left over slices after serving = " + leftoverSapa + " slices. You should have " + leftoverSapa + " slices left");
        System.out.println("Price = " + sapaprice);

        System.out.println("You can press 0 to order your pizza and make your payment...");
        int customerOrder = reader.nextInt();
    
    if (customerOrder == 0){
        System.out.println("\nOrder in progress... Thanks for your patronage!!!");
    }
      else if(customerOrder != 0){
        System.out.println("\nError...press 0 to order your pizza !!!");
      }
        break;
    }
  
    if (pizzatype == 2){
        System.out.printf("%s%1d%1s%1d%1s%1d%1s%1d%1s", "Number of boxes of pizza to buy = ", numOfSmallBox, " boxes. Small Money size contains ",  numberOfSmallSlices, " slices per box ",  numOfSmallBox,  " boxes should be sufficient for ", noOfpeople, " people ");
        System.out.println("\nNumber left over slices after serving = " + leftoverSmall + " slices. You should have " + leftoverSmall + " slices left");
        System.out.println("Price = " + smallmoneyprice);

        System.out.println("You can press 0 to order your pizza and make your payment...");
        int customerOrder = reader.nextInt();
    
    if (customerOrder == 0){
        System.out.println("\nOrder in progress... Thanks for your patronage!!!");
    }
      else if(customerOrder != 0){
        System.out.println("\nError...press 0 to order your pizza !!!");
      }
        break;
    }

    if (pizzatype == 3){
        System.out.printf("%s%1d%1s%1d%1s%1d%1s%1d%1s", "Number of boxes of pizza to buy = ", numbOfBigBox, " boxes. Small Money size contains ",  numberOfBigSlices, " slices per box ",  numbOfBigBox,  " boxes should be sufficient for ", noOfpeople, " people ");
        System.out.println("\nNumber left over slices after serving = " + leftoverBigBoys + " slices. You should have " + leftoverBigBoys + " slices left");
        System.out.println("Price = " + bigboysprice);

        System.out.println("You can press 0 to order your pizza and make your payment...");
        int customerOrder = reader.nextInt();
    
    if (customerOrder == 0){
        System.out.println("\nOrder in progress... Thanks for your patronage!!!");
    }
      else if(customerOrder != 0){
        System.out.println("\nError...press 0 to order your pizza !!!");
      }
        break;
    }

    if (pizzatype == 4){
        System.out.printf("%s%1d%1s%1d%1s%1d%1s%1d%1s", "Number of boxes of pizza to buy = ", numberOfOdogwuBox, " boxes. Small Money size contains ",  numberOfOdogwuSlices, " slices per box ",  numberOfOdogwuBox,  " boxes should be sufficient for ", noOfpeople, " people ");
        System.out.println("\nNumber left over slices after serving = " + leftoverOdogwu + " slices. You should have " + leftoverOdogwu + " slices left");
        System.out.println("Price = " + odogwuprice);

        System.out.println("You can press 0 to order your pizza and make your payment...");
        int customerOrder = reader.nextInt();
    
    if (customerOrder == 0){
        System.out.println("\nOrder in progress... Thanks for your patronage!!!");
    }
      else if(customerOrder != 0){
        System.out.println("\nError...press 0 to order your pizza !!!");
      }
        break;
    }
		
        }
    }
  }
