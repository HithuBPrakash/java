class FiveStarChickenRunner{
public static void main(String args[]){
System.out.println("Main method started");
double itemPrice1=FiveStarChicken.takeOrder("Butter Chicken");
System.out.println("Price of Butter Chicken is "+itemPrice1);
double itemPrice2=FiveStarChicken.takeOrder("Chicken Biryani");
System.out.println("Price of Chicken Biryani is "+itemPrice2);
double itemPrice3=FiveStarChicken.takeOrder("Grapes"); 
System.out.println("Price of Grapes is "+itemPrice3);
double itemPrice4=FiveStarChicken.takeOrder("Almonds"); 
System.out.println("Price of Almonds is "+itemPrice4);
System.out.println("Main method ended");
}
}
