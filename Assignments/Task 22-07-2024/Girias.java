class Girias{
 String storeName;
 String location;
 String owner;
 int numberOfBranches;
 double annualTurnover;
 public Girias(){
 System.out.println("Girias creation started");
 }
 public Girias(String storeName,String location,String owner,int numberOfBranches,double annualTurnover){
 System.out.println("parameterised constructor started");
 this.storeName=storeName;
 this.location=location;
 this.owner=owner;
 this.numberOfBranches=numberOfBranches;
 this.annualTurnover=annualTurnover;
}
 public void getDetails(){
 System.out.println("The store name is:"+this.storeName);
System.out.println("The location is:"+this.location);
System.out.println("The owner is:"+this.owner);
System.out.println("The number of branches is:"+this.numberOfBranches);
System.out.println("The annual turnover is:"+this.annualTurnover);
 }
}