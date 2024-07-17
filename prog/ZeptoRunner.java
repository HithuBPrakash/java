class ZeptoRunner{
public static void main(String args[]){
System.out.println("Main method started");
double itemPrice1=Zepto.takeOrder("Apple");
System.out.println("Price of Apple is "+itemPrice1);
double itemPrice2=Zepto.takeOrder("Banana");
System.out.println("Price of Banana is "+itemPrice2);
double itemPrice3=Zepto.takeOrder("Carrot");
System.out.println("Price of Carrot is "+itemPrice3);
double itemPrice4=Zepto.takeOrder("Dates");
System.out.println("Price of Dates is "+itemPrice4);
System.out.println("Main method ended");
}
}
