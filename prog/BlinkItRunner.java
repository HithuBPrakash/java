class BlinkItRunner{
public static void main(String args[]){
System.out.println("Main method started");
double itemPrice1=BlinkIt.takeOrder("Paneer");
System.out.println("Price of Paneer is "+itemPrice1);
double itemPrice2=BlinkIt.takeOrder("Mango");
System.out.println("Price of Mango is "+itemPrice2);
double itemPrice3=BlinkIt.takeOrder("Grapes");
System.out.println("Price of Grapes is "+itemPrice3);
double itemPrice4=BlinkIt.takeOrder("Almonds");
System.out.println("Price of Almonds is "+itemPrice4);
System.out.println("Main method ended");
}
}
