class Shampoo {
String brandName;
int qty;
String type;
double price;
String mgfDate;
String expDate;
int id;

public boolean createShampoo(int id, String brandName, int qty, String type, double price, String mgfDate, String expDate) {
boolean isCreateShampoo = false;
if (id != 0 && brandName != null && qty > 0 && type != null && price > 0 && mgfDate != null && expDate != null) {
	this.id = id;
this.brandName = brandName;
this.qty = qty;
this.type = type;
this.price = price;
this.mgfDate = mgfDate;
this.expDate = expDate;
isCreateShampoo = true;
}
return isCreateShampoo;
}

public void displayShampoo() {
System.out.println("The Shampoo ID is: " + this.id);
System.out.println("The Brand Name is: " + this.brandName);
System.out.println("The Quantity is: " + this.qty);
System.out.println("The Type is: " + this.type);
System.out.println("The Price is: Rs." + this.price);
System.out.println("The Manufacturing Date is: " + this.mgfDate);
System.out.println("The Expiry Date is: " + this.expDate);
}
}

