class Amazon{
static String userName;
static String emailId;
static long phNo;
static String pwd;
static String address;

public static boolean createAccount(String uname, String email, long pNo, String password, String addr){
boolean isAccountCreated=false;
userName=uname;
emailId=email;
phNo=pNo;
pwd=password;
address=addr;
return isAccountCreated=true;
}

public static void getAccountDetails(){
System.out.println("The user Name is: " + userName);
System.out.println("The email is: " + emailId);
System.out.println("The phone Number is: " + phNo);
System.out.println("The password is: " + pwd);
System.out.println("The address is: " + address);
}
}