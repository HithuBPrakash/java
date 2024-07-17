class AmazonRunner{
public static void main(String args[]){
boolean MyAccount=Amazon.createAccount("john", "john@gmail.com", 9876543210L, "john123", "Rajajinagar");
System.out.println(MyAccount);
Amazon.getAccountDetails();
}
}