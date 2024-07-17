class LoanApplicationRunner{
public static void main(String args[]){
boolean MyAcc=LoanApplication.createApplication("123456789", "Bank of Baroda", 750, 5.5, "Personal Loan");
if(MyAcc==true){
LoanApplication.getApplication();
}
else{
System.out.println("Enter valid details");
}
}
}


