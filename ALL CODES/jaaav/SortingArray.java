import java.util.*;

public class SortingArray{
public static void main(String... md){

int[] ages = {53, 79, 64, 9, 1, 45, 22};

ArrayList<Integer> look = new ArrayList<>();

Arrays.sort(ages);

for (int counter : ages){
System.out.println(counter);
}

for(int count = 0; count < look.size(); ++count){
System.out.println(look.get(count));
}

ArrayList<String> reader = new ArrayList<>();


reader.add("123");
reader.add("65");
reader.add("75");
reader.add("875");
look.add(43);

System.out.println(reader.contains("123"));
System.out.println(reader.contains("64"));
System.out.println(look.contains(43));



   }
}