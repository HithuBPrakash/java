class XWorkZ{
static String studentName;
static long phoneNo;
static String emailId;
static String usn;
static int yearOfPassout;

public static boolean createAccount(String name, long pNo, String email, String usnCode, int passoutYear){
boolean isAccountCreated = false;
boolean isNameValid = false;
boolean isPhoneValid = false;
boolean isEmailValid = false;
boolean isUsnValid = false;
boolean isYearValid = false;

if (name != null ) {
studentName = name;
isNameValid = true;
} 
else {
System.out.println("Enter a valid name");
}

if (pNo > 0) {
phoneNo = pNo;
isPhoneValid = true;
} 
else {
System.out.println("Enter a valid phone number");
}

if (email != null) {
emailId = email;
isEmailValid = true;
} 
else {
System.out.println("Enter a valid email");
}

if (usnCode != null &&)) {
usn = usnCode;
isUsnValid = true;
} 
else {
System.out.println("Enter a valid USN");
}

if (passoutYear > 0) {
yearOfPassout = passoutYear;
isYearValid = true;
} 
else {
System.out.println("Enter a valid year of passout");
}

if (name!=null && email!=null && pno>0 && usnCode!=null && passoutYear!=0) {
isAccountCreated = true;
}

return isAccountCreated;
}

public static void getAccountDetails(){
System.out.println("Student Name: " + studentName);
System.out.println("Phone Number: " + phoneNo);
System.out.println("Email ID: " + emailId);
System.out.println("USN: " + usn);
System.out.println("Year of Passout: " + yearOfPassout);
}
}