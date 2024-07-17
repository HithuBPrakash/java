class AxisBankRunner{
public static void main(String[] args){
System.out.println("main method started");
//String name,String email,String dob,String accountType,String phoneNumber,String pan,long aadharNum,int age,String address,String nominee
boolean MyAccount=AxisBank.createBankAccount(null,"john@gmail.com","18/01/2003","Savings Account","995646667880","ABC123",123456,30,"Rajajinager","Ria");
if(MyAccount==true){
AxisBank.getBankAccountDetails();
}
else{
	System.out.println("give valid values");
}

}
}