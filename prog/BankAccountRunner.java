class BankAccountRunner{
public static void main(String args[]){
BankAccount.credit(50000);
double MyBalance=BankAccount.accountBalance();
System.out.println(MyBalance);
BankAccount.credit(4000);
MyBalance=BankAccount.accountBalance();
System.out.println(MyBalance);
BankAccount.debit(7500);
MyBalance=BankAccount.accountBalance();
System.out.println(MyBalance);
BankAccount.debit(500);
MyBalance=BankAccount.accountBalance();
System.out.println(MyBalance);
BankAccount.credit(4500);
MyBalance=BankAccount.accountBalance();
System.out.println(MyBalance);
BankAccount.debit(500000);
MyBalance=BankAccount.accountBalance();
System.out.println(MyBalance);


}
}