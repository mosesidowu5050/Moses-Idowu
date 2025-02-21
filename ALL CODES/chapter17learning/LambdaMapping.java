import java.util.stream.IntStream;

class LambdaMapping {
    public static void main(String[] args){

int i = 2;

System.out.printf("Sum of the even ints from 2 through 20 is: %d%n", 
IntStream.rangeClosed(1, 10).map((x)-> {return x * i;}).sum());

System.out.println("Welcome to lambdas!");
   }
}