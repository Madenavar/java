class BankAccountRunner{
public static void main (String[]balance){
  BankAccount.credit(0.00);
  double availableAmount= BankAccount.getBalance();
  System.out.println(availableAmount);
    
	BankAccount.credit(5000.00);
    availableAmount= BankAccount.getBalance();
   System.out.println(availableAmount);
   
   BankAccount.credit(70.00);
   availableAmount= BankAccount.getBalance();
   System.out.println(availableAmount);
 
 BankAccount.credit(7020.00);
   availableAmount= BankAccount.getBalance();
  System.out.println(availableAmount);
  
  BankAccount.credit(7060.00);
   availableAmount= BankAccount.getBalance();
  System.out.println(availableAmount);


}

}