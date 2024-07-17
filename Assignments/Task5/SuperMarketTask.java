package Task5;

public class SuperMarketTask {
        
    static String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Mango", "Pineapple", "Strawberry", "Blueberry", "Watermelon", "Peach"};
    static String[] vegetables = {"Carrot", "Broccoli", "Spinach", "Potato", "Tomato", "Onion", "Garlic", "Pepper", "Cabbage", "Lettuce"};
    static String[] stationeries = {"Notebook", "Pen", "Pencil", "Eraser", "Sharpener", "Ruler", "Marker", "Glue", "Scissors", "Stapler"};
    static String[] snacks = {"Chips", "Popcorn", "Pretzels", "Nuts", "Crackers", "Chocolate", "Candy", "Granola Bar", "Jerky", "Trail Mix"};
    static String[] beverages = {"Water", "Juice", "Soda", "Coffee", "Tea", "Milkshake", "Smoothie", "Lemonade", "Iced Tea", "Energy Drink"};

public static void main(String[] args) {
for(int index=0;index<fruits.length;index++){
    System.out.println(fruits[index]);
}
System.out.println("-----------------------------------------------------------------------");
for(String vegetable:vegetables){
    System.out.println(vegetable);
}
System.out.println("-----------------------------------------------------------------------");
for(String stationery:stationeries){
    System.out.println(stationery);
}
System.out.println("-----------------------------------------------------------------------");
for(String snack:snacks){
    System.out.println(snack);
}
System.out.println("-----------------------------------------------------------------------");
for(String beverage:beverages){
    System.out.println(beverage);
}
}
}

