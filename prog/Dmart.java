package prog;

public class Dmart {
    
        
        static String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Mango", "Pineapple", "Strawberry", "Blueberry", "Watermelon", "Peach"};
        static String[] vegetables = {"Carrot", "Broccoli", "Spinach", "Potato", "Tomato", "Onion", "Garlic", "Pepper", "Cabbage", "Lettuce"};
public static void main(String[] args) {
    for(int index=0;index<fruits.length;index++){
        System.out.println(fruits[index]);
    }
    System.out.println("-----------------------------------------------------------------------");
    for(String vegetable:vegetables){
        System.out.println(vegetable);
    }
}
}//array is container used to store similar value/ type of data in single reference

