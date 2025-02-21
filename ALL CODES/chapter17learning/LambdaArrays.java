import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class LambdaArrays {
    public static void main(String[] args){

int[] nums = {10, 2, 9, 4, 5, 1, 3, 8, 6, 7};

System.out.print("Before Of The Numbers: ");
System.out.println(IntStream.of (nums)
.mapToObj(String :: valueOf)
.collect(Collectors.joining(" ")));

System.out.printf("%nCount: %d%n", IntStream.of(nums).count());
System.out.printf("Min: %d%n", IntStream.of(nums).min().getAsInt());
System.out.printf("Max: %d%n", IntStream.of(nums).max().getAsInt());
System.out.printf("Sum: %d%n", IntStream.of(nums).sum());
System.out.printf("Average: %.2f%n", IntStream.of(nums).average().getAsDouble());

System.out.println();
System.out.printf("Sum via reduce method %d%n", IntStream.of(nums).reduce(0, (x, y) -> x + y ));
System.out.printf("Product via reduce method %d%n", IntStream.of(nums).reduce((x, y) -> x * y ).getAsInt());
System.out.printf("Sum Of Square via map and sum %d%n", IntStream.of(nums).map(x -> x * x).sum());

System.out.println();
System.out.printf("Numbers displayed in sorted order %s%n", IntStream.of(nums)
.sorted().mapToObj(String :: valueOf).collect(Collectors.joining(" ")));

   }
}