class FactorialFunction {
public static void main(String[] args){

        int result = fact(3);
            System.out.print(result);
System.out.println();

          int result2 = facto(5);
            System.out.println(result2);

}

public static int fact (int i) {

      if (i != 0)
      	return i * fact (i - 1);

return 1;

      } 

public static int facto (int j) {
int sum =0;

for (int count = 0; count < j; count++){ 
        sum = count * ;
  }
return sum;

}
  }

//5! = 5 * 4 * 3 * 2 * 1 = 120