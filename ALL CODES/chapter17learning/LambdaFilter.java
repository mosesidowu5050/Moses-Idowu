import java.util.stream.IntStream;

class LambdaFilter {
    public static void main(String[] args){

System.out.printf("Sum of the triples of even ints from 2 through 20 is: %d%n",
IntStream.rangeClosed(1, 10).filter((x) -> {return x % 2 == 0;}).map((x) -> {return x * 3;}).sum());

System.out.printf("Sum of the triples of odd ints from 2 through 20 is: %d%n",
IntStream.rangeClosed(1, 10).filter((x) -> {return x % 2 == 1;}).map((x) -> {return x * 3;}).sum());

   }
}