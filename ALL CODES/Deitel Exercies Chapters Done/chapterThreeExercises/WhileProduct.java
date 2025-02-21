class WhileProduct {
 public static void main(String[] args){

int products = 3;
String product = "A";
String unproduct = "100";


System.out.println(product != "unproduct" ? "Yes" : "No"); 

while (products <= 100){
products = 4 * products;
System.out.println(products);
}

   }
}