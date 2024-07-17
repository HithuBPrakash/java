package Task4;

 public class SuperMarket {
    static String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Mango", "Pineapple", "Strawberry", "Blueberry", "Watermelon", "Peach"};
    static String[] vegetables = {"Carrot", "Broccoli", "Spinach", "Potato", "Tomato", "Onion", "Garlic", "Pepper", "Cabbage", "Lettuce"};
    static String[] dairy = {"Milk", "Cheese", "Butter", "Yogurt", "Cream", "Cottage Cheese", "Sour Cream", "Buttermilk", "Ghee", "Condensed Milk"};
    static String[] bakery = {"Bread", "Bagel", "Croissant", "Muffin", "Donut", "Cake", "Cookie", "Pie", "Baguette", "Brownie"};
    static String[] beverages = {"Water", "Juice", "Soda", "Coffee", "Tea", "Milkshake", "Smoothie", "Lemonade", "Iced Tea", "Energy Drink"};
    static String[] snacks = {"Chips", "Popcorn", "Pretzels", "Nuts", "Crackers", "Chocolate", "Candy", "Granola Bar", "Jerky", "Trail Mix"};
    static String[] frozenFoods = {"Ice Cream", "Frozen Pizza", "Frozen Vegetables", "Frozen Fruit", "Frozen Meals", "Frozen Yogurt", "Frozen Fish", "Frozen Meat", "Frozen Waffles", "Frozen Desserts"};
    static String[] householdItems = {"Toilet Paper", "Paper Towels", "Laundry Detergent", "Dish Soap", "Garbage Bags", "Cleaning Spray", "Sponges", "Mop", "Broom", "Dustpan"};
    static String[] personalCare = {"Shampoo", "Conditioner", "Soap", "Toothpaste", "Toothbrush", "Deodorant", "Lotion", "Razor", "Shaving Cream", "Face Wash"};
    static String[] babyProducts = {"Diapers", "Baby Wipes", "Baby Food", "Baby Lotion", "Baby Shampoo", "Baby Powder", "Baby Bottles", "Pacifiers", "Baby Formula", "Baby Clothes"};
    static String[] petSupplies = {"Dog Food", "Cat Food", "Bird Seed", "Fish Food", "Pet Toys", "Pet Bed", "Pet Leash", "Pet Collar", "Pet Shampoo", "Pet Treats"};
    static String[] electronics = {"TV", "Laptop", "Smartphone", "Tablet", "Headphones", "Speaker", "Camera", "Smartwatch", "Charger", "USB Cable"};
    static String[] clothing = {"T-shirt", "Jeans", "Jacket", "Dress", "Skirt", "Sweater", "Socks", "Shoes", "Hat", "Scarf"};
    static String[] stationery = {"Notebook", "Pen", "Pencil", "Eraser", "Sharpener", "Ruler", "Marker", "Glue", "Scissors", "Stapler"};
    static String[] sportsEquipment = {"Basketball", "Soccer Ball", "Tennis Racket", "Baseball Bat", "Golf Clubs", "Yoga Mat", "Dumbbells", "Bicycle", "Helmet", "Swimming Goggles"};

    public static void main(String[] args) {
        System.out.println("Fruits: " + fruits[0] + ", " + fruits[1] + ", " + fruits[2] + ", " + fruits[3] + ", " + fruits[4] + ", " + fruits[5] + ", " + fruits[6] + ", " + fruits[7] + ", " + fruits[8] + ", " + fruits[9]);
        System.out.println("Vegetables: " + vegetables[0] + ", " + vegetables[1] + ", " + vegetables[2] + ", " + vegetables[3] + ", " + vegetables[4] + ", " + vegetables[5] + ", " + vegetables[6] + ", " + vegetables[7] + ", " + vegetables[8] + ", " + vegetables[9]);
        System.out.println("Dairy: " + dairy[0] + ", " + dairy[1] + ", " + dairy[2] + ", " + dairy[3] + ", " + dairy[4] + ", " + dairy[5] + ", " + dairy[6] + ", " + dairy[7] + ", " + dairy[8] + ", " + dairy[9]);
        System.out.println("Bakery: " + bakery[0] + ", " + bakery[1] + ", " + bakery[2] + ", " + bakery[3] + ", " + bakery[4] + ", " + bakery[5] + ", " + bakery[6] + ", " + bakery[7] + ", " + bakery[8] + ", " + bakery[9]);
        System.out.println("Beverages: " + beverages[0] + ", " + beverages[1] + ", " + beverages[2] + ", " + beverages[3] + ", " + beverages[4] + ", " + beverages[5] + ", " + beverages[6] + ", " + beverages[7] + ", " + beverages[8] + ", " + beverages[9]);
        System.out.println("Snacks: " + snacks[0] + ", " + snacks[1] + ", " + snacks[2] + ", " + snacks[3] + ", " + snacks[4] + ", " + snacks[5] + ", " + snacks[6] + ", " + snacks[7] + ", " + snacks[8] + ", " + snacks[9]);
        System.out.println("Frozen Foods: " + frozenFoods[0] + ", " + frozenFoods[1] + ", " + frozenFoods[2] + ", " + frozenFoods[3] + ", " + frozenFoods[4] + ", " + frozenFoods[5] + ", " + frozenFoods[6] + ", " + frozenFoods[7] + ", " + frozenFoods[8] + ", " + frozenFoods[9]);
        System.out.println("Household Items: " + householdItems[0] + ", " + householdItems[1] + ", " + householdItems[2] + ", " + householdItems[3] + ", " + householdItems[4] + ", " + householdItems[5] + ", " + householdItems[6] + ", " + householdItems[7] + ", " + householdItems[8] + ", " + householdItems[9]);
        System.out.println("Personal Care: " + personalCare[0] + ", " + personalCare[1] + ", " + personalCare[2] + ", " + personalCare[3] + ", " + personalCare[4] + ", " + personalCare[5] + ", " + personalCare[6] + ", " + personalCare[7] + ", " + personalCare[8] + ", " + personalCare[9]);
        System.out.println("Baby Products: " + babyProducts[0] + ", " + babyProducts[1] + ", " + babyProducts[2] + ", " + babyProducts[3] + ", " + babyProducts[4] + ", " + babyProducts[5] + ", " + babyProducts[6] + ", " + babyProducts[7] + ", " + babyProducts[8] + ", " + babyProducts[9]);
        System.out.println("Pet Supplies: " + petSupplies[0] + ", " + petSupplies[1] + ", " + petSupplies[2] + ", " + petSupplies[3] + ", " + petSupplies[4] + ", " + petSupplies[5] + ", " + petSupplies[6] + ", " + petSupplies[7] + ", " + petSupplies[8] + ", " + petSupplies[9]);
        System.out.println("Electronics: " + electronics[0] + ", " + electronics[1] + ", " + electronics[2] + ", " + electronics[3] + ", " + electronics[4] + ", " + electronics[5] + ", " + electronics[6] + ", " + electronics[7] + ", " + electronics[8] + ", " + electronics[9]);
        System.out.println("Clothing: " + clothing[0] + ", " + clothing[1] + ", " + clothing[2] + ", " + clothing[3] + ", " + clothing[4] + ", " + clothing[5] + ", " + clothing[6] + ", " + clothing[7] + ", " + clothing[8] + ", " + clothing[9]);
        System.out.println("Stationery: " + stationery[0] + ", " + stationery[1] + ", " + stationery[2] + ", " + stationery[3] + ", " + stationery[4] + ", " + stationery[5] + ", " + stationery[6] + ", " + stationery[7] + ", " + stationery[8] + ", " + stationery[9]);
        System.out.println("Sports Equipment: " + sportsEquipment[0] + ", " + sportsEquipment[1] + ", " + sportsEquipment[2] + ", " + sportsEquipment[3] + ", " + sportsEquipment[4] + ", " + sportsEquipment[5] + ", " + sportsEquipment[6] + ", " + sportsEquipment[7] + ", " + sportsEquipment[8] + ", " + sportsEquipment[9]);
    }
} 
