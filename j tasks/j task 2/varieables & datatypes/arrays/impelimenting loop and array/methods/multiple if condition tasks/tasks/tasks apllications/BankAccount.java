class BankAccount{
 static double balance;
 public static void debit(double amount){
 System.out.println("The Debit amount started");
 if (amount<=balance)
 balance=balance-amount;
 else 
	 System.out.println("The insufficient Banlance");
 System.out.println("The debit amount Endend");
 return;
}
public static void credit(double amount){
 System.out.println("The credit amount started");
 if (amount>0)
 balance=balance+amount;
else
System.out.println("The zero amount can't credit ");	
 System.out.println("The credit amount Endend");

 return;
}
public static double getBalance(){
 System.out.println("The remaining amount");
return balance;
}
}
