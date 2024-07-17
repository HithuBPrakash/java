class ZomatoRunner{
public static void main(String args[]){
System.out.println("Main method started");
double itemPrice1=Zomato.takeOrder("Burger");
System.out.println("Price of Burger is "+itemPrice1);
double itemPrice2=Zomato.takeOrder("Pasta");
System.out.println("Price of Pasta is "+itemPrice2);
double itemPrice3=Zomato.takeOrder("VadaPav");
System.out.println("Price of VadaPav is "+itemPrice3);
double itemPrice4=Zomato.takeOrder("Idli");
System.out.println("Price of Idli is "+itemPrice4);
System.out.println("Main method ended");

}
}