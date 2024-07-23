class SimCard{
String provider;
String networkType;
String planType;
double balance;
String validity;
public SimCard(){
System.out.println("SimCard creation started");
}
public SimCard(String provider,String networkType,String planType,double balance,String validity){
 System.out.println("parameterised constructor started");
 this.provider=provider;
 this.networkType=networkType;
 this.planType=planType;
 this.balance=balance;
 this.validity=validity;
}
public void getDetails(){
System.out.println("The provider is:"+this.provider);
System.out.println("The network type is:"+this.networkType);
System.out.println("The plan type is:"+this.planType);
System.out.println("The balance is:"+this.balance);
System.out.println("The validity is:"+this.validity);
}
}