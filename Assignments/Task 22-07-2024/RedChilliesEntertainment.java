class RedChilliesEntertainment{
 String owner;
 String location;
 int numberOfEmployees;
 double annualRevenue;
 String famousFor;
 public RedChilliesEntertainment(){
 System.out.println("Red Chillies Entertainment creation started");
 }
 public RedChilliesEntertainment(String owner,String location,int numberOfEmployees,double annualRevenue,String famousFor){
 System.out.println("parameterised constructor started");
 this.owner=owner;
 this.location=location;
 this.numberOfEmployees=numberOfEmployees;
 this.annualRevenue=annualRevenue;
 this.famousFor=famousFor;
}
 public void getDetails(){
 System.out.println("The owner is:"+this.owner);
System.out.println("The location is:"+this.location);
System.out.println("The number of employees is:"+this.numberOfEmployees);
System.out.println("The annual revenue is:"+this.annualRevenue);
System.out.println("The company is famous for:"+this.famousFor);
 }
}