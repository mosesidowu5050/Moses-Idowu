public class Bank {
   private String name;
   private int pin;
   private double balance;

public Bank (String name, int pin, double balance){
	this.name = name;
	this.pin = pin;
	this.balance = balance;
}
public void setName (String name){
   this.name = name;
}
public void setPin(int pin){
   this.pin = pin;
}
public String getName (){
   return name;
}

public void deposit (double amount){
  if (amount > 0.0) balance += amount;
  this.balance = balance;

}
public double getBalance (){
   return balance;
}

public void setPin(int pin){
   this.pin = pin;
}

public double transfers (int pin, double transfer){
   if (this.pin==pin && transfer > 0.0) balance -= transfer;
   this.balance = balance;
   return balance;
  }

public double checkBalance(int pin, double balance){
    if(this.pin == pin){
 }
return balance;
   }
}