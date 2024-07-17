class Passport{
	
static String cpv;
static int dcdr;
static String sur;
static String Name;
static String dateofbirth;
static String Email;
static 	boolean emailsameaslogin;
static String login;
static String pwd;
static String confirmpwd;
static String hintQ;
static String AnsQ;
static String Captcha;

public static boolean createPassport(String cpvLocation,int dcdrLocation,String surName,String givenName,
String dob,String email,boolean isEmailLoginSame,String loginId,String password,String confirmPassword,String hintQues,String hintAns,
String captcha){
boolean isPassportCreated=false;
if(cpvLocation!=null && dcdrLocation>0 && surName!=null && givenName!=null && email!=null && dob!=null && password!=null && confirmPassword!=null && 
loginId!=null && confirmPassword!=null && hintQues!=null && hintAns!=null && captcha!=null){
cpv=cpvLocation;
dcdr=dcdrLocation;
sur=surName;
Name=givenName;
dateofbirth=dob;
Email=email;
emailsameaslogin=isEmailLoginSame;
login=loginId;
pwd=password;
confirmpwd=confirmPassword;
hintQ=hintQues;
AnsQ=hintAns;
Captcha=captcha;
return isPassportCreated=true;
}
else{
	System.out.println("Type the information that is mandatory");
}
return isPassportCreated;
}
public static void getPassportDetails(){
	System.out.println("The cpv Location is "+cpv);
	System.out.println("The dcdr Location is "+dcdr);
	System.out.println("The sur Name is "+sur);
	System.out.println("The given name is "+Name);
	System.out.println("The dob is "+dateofbirth);
	System.out.println("The email is "+Email);
	System.out.println("The isEmailLoginSame is "+emailsameaslogin);
    System.out.println("The loginId is "+login);
	System.out.println("The password is "+pwd);
	System.out.println("The confirmPassword is "+confirmpwd);
	System.out.println("The hintQues is "+hintQ);
	System.out.println("The hintAns is "+AnsQ);
	System.out.println("The captcha is "+Captcha);
}










}