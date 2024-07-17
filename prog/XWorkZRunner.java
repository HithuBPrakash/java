class XWorkZRunner{
public static void main(String args[]){
boolean MyAccount = XWorkZ.createAccount("John", 9876543210L, "john@example.com", "1AT18CS001", 2024);
if (MyAccount) {
XWorkZ.getAccountDetails();
} else {
System.out.println("Enter valid details");
}
}
}