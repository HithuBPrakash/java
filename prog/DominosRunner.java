class DominosRunner{
public static void main(String args[]){
System.out.println("Main method started");
double itemPrice1=Dominos.takeOrder("Paneer Tikka Pizza");
System.out.println(itemPrice1);
double itemPrice2=Dominos.takeOrder("Veggie Paradise Pizza");
System.out.println(itemPrice2);
double itemPrice3=Dominos.takeOrder("Grapes"); 
System.out.println("Price of Grapes is "+itemPrice3);
double itemPrice4=Dominos.takeOrder("Almonds");
System.out.println("Price of Almonds is "+itemPrice4);

double itemQuantity=Dominos.takeOrder("Burger pizza",4);
System.out.println(itemQuantity);

System.out.println("Main method ended");

}
}
