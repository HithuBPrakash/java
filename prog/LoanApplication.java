class LoanApplication{

static String bankAcc;
static String nameOfBank;
static int myCreditScore;
static double roi;
static String typeOfLoan;



public static boolean createApplication(String bankAccountNo , String bankName ,int creditScore, double rateOfInterest ,String loanType){
boolean ApplicationCreated=false;
boolean ApplicationCreated = false;
boolean isbankAccvalid = false;
boolean isbankNamevalid = false;
boolean isCreditScoreValid = false;
boolean isRateOfInterestValid = false;
boolean isLoanTypeValid = false;

if (bankAccountNo != null ) {
bankAcc = bankAccountNo;
isbankAccvalid = true;
} 
else {
System.out.println("Enter valid bank account details");
}

if (bankName != null ) {
nameOfBank = bankName;
isbankNamevalid = true;
} 
else {
System.out.println("Enter valid bank name");
}

if (creditScore > 0) {
myCreditScore = creditScore;
isCreditScoreValid = true;
} 
else {
System.out.println("Enter a valid credit score");
}

if (rateOfInterest > 0.0) {
roi = rateOfInterest;
isRateOfInterestValid = true;
} 
else {
System.out.println("Enter a valid rate of interest");
}

if (loanType != null )) {
typeOfLoan = loanType;
isLoanTypeValid = true;
} 
else {
System.out.println("Enter a valid loan type");
}

if (bankAccountNo!=null , bankName!=null ,creditScore>0,  rateOfInterest>0.0 , loanType!=null) {
ApplicationCreated = true;
}

return ApplicationCreated;
}



public static void getApplication(){
System.out.println("Bank Account Number is:"+bankAcc);
System.out.println("Bank Name: " + nameOfBank);
System.out.println("Credit Score: " + myCreditScore);
System.out.println("Rate of Interest: " + roi);
System.out.println("Loan Type: " + typeOfLoan);
}