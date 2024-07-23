class Battery{
 int capacity;
 String brand;
 double price;
 String type;
 String warranty;
 public Battery(){
 System.out.println("Battery creation started");
 }
 public Battery(int capacity,String brand,double price,String type,String warranty){
	 System.out.println("parameterised constructor started");
	 this.capacity=capacity;
	 this.brand=brand;
	 this.price=price;
	 this.type=type;
	 this.warranty=warranty;
 }
 public void getDetails(){
 System.out.println("The capacity is:"+this.capacity);
System.out.println("The brand is:"+this.brand);
System.out.println("The price is:"+this.price);
System.out.println("The type is:"+this.type);
System.out.println("The warranty is:"+this.warranty);
 }
}
