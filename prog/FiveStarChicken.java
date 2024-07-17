class FiveStarChicken{
public static double takeOrder(String foodName){
if(foodName=="Butter Chicken"){
return 250.00;
}
if(foodName=="Chicken Biryani"){
return 180.00;
}
if(foodName=="Chicken 65"){
return 200.00;
}
if(foodName=="Tanddori Chicken"){
return 150.00;
}
if(foodName=="Paneer Roll"){
return 120.00;
}
if(foodName=="Veggie Burger"){
return 100.00;
}
if(foodName=="Naan"){
return 130.00;
}
if(foodName=="Chicken Wings"){
return 160.00;
}
if(foodName=="Egg Fried Rice"){
return 110.00;
}
if(foodName=="Fish Fry"){
return 170.00;
}
if(foodName=="Mutton Curry"){
return 280.00;
}
if(foodName=="Vegetable Biryani"){
return 90.00;
}
if(foodName=="Chocolate Mousse"){
return 80.00;
}
else{
System.out.println("Food name not found");
}
return 0.0;
}
}
