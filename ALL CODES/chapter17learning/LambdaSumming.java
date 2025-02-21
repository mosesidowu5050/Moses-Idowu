import java.util.stream.IntStream;

class LambdaSumming {
    public static void main(String[] args){

int total = IntStream.rangeClosed(1, 10).sum();
System.out.printf("Total of 1 through 10 is: %d%n", total);

System.out.printf("Sum of 1 through 10 is: %d%n", IntStream.rangeClosed(1, 10).sum());

   }
}