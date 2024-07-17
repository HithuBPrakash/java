class MyntraRunner{
public static void main(String args[]){
boolean MyAccount = Myntra.createAccount("john", "john@gmail.com", 9876543210L, "john123", "123 Main St, Anytown");
if(MyAccount == true){
Myntra.getAccountDetails();
}
else{
System.out.println("Enter valid details");
}
}
}