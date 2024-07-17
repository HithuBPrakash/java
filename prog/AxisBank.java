class AxisBank{

static String yourName;
static String emailId;
static String dateOfBirth;
static String accountTypeYouNeed;
static String phoneNum;
static String panNum;
static long aadharNumber;
static int ageNum;
static String addressLoc;
static String nomineeName;


public static boolean createBankAccount(String name,String email,String dob,String accountType,String phoneNumber,String pan,long aadharNum,int age,String address,String nominee){
boolean iscreateBankAccount=false;
boolean isnamevalid=false;
boolean isemailvalid=false;
boolean isaccountTypeValid=false;
 boolean isaadharNumbervalid=false;
//if(name!=null && email!=null && accountType!=null && pan!=null && aadharnum>0 && age>0 && nominee!=null)
	if(name!=null){
		yourName=name;
		 isnamevalid=true;
	}else{
		System.out.println("Please provide valid name");
	}
	if(email!=null){
		emailId=email;
		isemailvalid=true;
	}
	else{
		System.out.println("Please provide valid email");
	}
	if(accountType!=null){
		accountTypeYouNeed=accountType;
		isaccountTypeValid=false;
	
	}
	else{
		System.out.println("Please provide account Type");
	}
	if(aadharNum>0){
		aadharNumber=aadharNum;
		isaadharNumbervalid=true;
	}
	else{
		System.out.println("Please provide aadhar Number");
	}
dateOfBirth=dob;

phoneNum=phoneNumber;
panNum=pan;

ageNum=age;
addressLoc=address;
nomineeName=nominee;

if(name!=null && email!=null && accountType!=null && aadharNum>0)
{
	iscreateBankAccount=true;
}
return iscreateBankAccount;
}

  public static void getBankAccountDetails(){
	  System.out.println("The given name is "+yourName);
	  System.out.println("The given email  is "+emailId);
	  	  System.out.println("The given account Type is "+accountTypeYouNeed);
          	  System.out.println("The given aadhar Number is "+aadharNumber);
	  
  }	  
}