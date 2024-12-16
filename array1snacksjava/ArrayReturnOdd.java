import java.util.*;

public class ArrayReturnOdd{
public static void main(String[] args){

List<Integer> reader = new ArrayList<Integer>();

reader.add(10);
reader.add(20);
reader.add(30);
reader.add(40);
reader.add(50);
reader.add(60);


System.out.print("Elements at odd positions are : ");

for (int count = 1; count < 6; count = count + 2) {

System.out.print(reader.get(count) + " ");
        }
    }
}