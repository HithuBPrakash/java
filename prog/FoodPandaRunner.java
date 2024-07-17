class FoodPandaRunner{
public static void main(String args[]){
System.out.println("Main method started");
double itemPrice1=FoodPanda.takeOrder("Hummus and Peta Bread");
System.out.println("Price of Hummus wit Peta Bread is "+itemPrice1);
double itemPrice2=FoodPanda.takeOrder("Nachos");
System.out.println("Price of Nachos is "+itemPrice2);
double itemPrice3=FoodPanda.takeOrder("Burritos");
System.out.println("Price of Burritos is "+itemPrice3);
double itemPrice4=FoodPanda.takeOrder("Idli");
System.out.println("Price of Idli is "+itemPrice4);
System.out.println("Main method ended");

}
}