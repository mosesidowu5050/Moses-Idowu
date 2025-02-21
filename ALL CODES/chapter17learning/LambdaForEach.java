import java.security.SecureRandom;
import java.util.stream.Collectors;

class LambdaForEach {
     public static void main(String[] args){

SecureRandom randomNumber = new SecureRandom();

System.out.printf("Get 10 random numbers from 1 - 6: %n");
randomNumber.ints(10, 1, 7).forEach(System.out :: println);

String values = randomNumber.ints(5, 1, 10)
.mapToObj(String :: valueOf)
.collect(Collectors.joining(" "));

System.out.printf("10 Random Numbers on one line: %s", values);
   }
}