class BankAccount{
static double AccBalance;

public static void credit(double amount){
System.out.println("credit method started");
if(amount>0)
AccBalance=AccBalance+amount;
else{
	System.out.println("Enter the amount");
}
System.out.println("credit method ended");
}

public static void debit(double amount){
System.out.println("debit method started");
if(amount<=AccBalance)
AccBalance=AccBalance-amount;
else{
	System.out.println("Insufficient Balance");
}
System.out.println("debit method ended");
}

public static double accountBalance(){
System.out.println("The account balance is");
return AccBalance;
}
}