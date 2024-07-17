class Myntra{
static String userName;
static String emailId;
static long phNo;
static String pwd;
static String address;

public static boolean createAccount(String uname, String email, long pNo, String password, String addr){
boolean isAccountCreated=false;
boolean isUserNameValid = false;
boolean isEmailValid = false;
boolean isPhNoValid = false;
boolean isPwdValid = false;
boolean isAddressValid = false;

if (uname != null) {
userName = uname;
isUserNameValid = true;
} 
else {
System.out.println("Enter valid user name");
}

if (email != null ) {
emailId = email;
isEmailValid = true;
} 
else {
System.out.println("Enter valid email");
}

if (pNo > 0) {
phNo = pNo;
isPhNoValid = true;
} 
else {
System.out.println("Enter a valid phone number");
}

if (password != null) {
pwd = password;
isPwdValid = true;
} 
else {
System.out.println("Enter a valid password");
}

if (addr != null)) {
address = addr;
isAddressValid = true;
} 
else {
System.out.println("Enter a valid address");
}

if (isUserNameValid && isEmailValid && isPhNoValid && isPwdValid && isAddressValid) {
isAccountCreated = true;
}

return isAccountCreated;
}

public static void getAccountDetails(){
System.out.println("The user Name is: " + userName);
System.out.println("The email is: " + emailId);
System.out.println("The phone Number is: " + phNo);
System.out.println("The password is: " + pwd);
System.out.println("The address is: " + address);
}
}