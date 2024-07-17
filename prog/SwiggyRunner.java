class SwiggyRunner{
public static void main(String args[]){
System.out.println("Main method started");
double itemPrice1=Swiggy.takeOrder("Poha");
System.out.println("Price of Poha is "+itemPrice1);
double itemPrice2=Swiggy.takeOrder("Idli");
System.out.println("Price of Idli is "+itemPrice2);
double itemPrice3=Swiggy.takeOrder("Pasta");
System.out.println("Price of Pasta is "+itemPrice3);
double itemPrice4=Swiggy.takeOrder("Pulav",5);
System.out.println("Price of Pulav is "+itemPrice4);
double itemQuantity=Swiggy.takeOrder("Poha",3);
System.out.println(itemQuantity);
double itemQuantity1=Swiggy.takeOrder("Paratha",4);
System.out.println(itemQuantity1);
System.out.println("Main method ended");

}
}