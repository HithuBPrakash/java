class Zomato{
public static double takeOrder(String foodName){
System.out.println("method started");
if(foodName=="Pizza"){
return 200.00;
}
if(foodName=="Burger"){
return 120.00;
}
if(foodName=="Roll"){
return 100.00;
}
if(foodName=="PaniPuri"){
return 30.00;
}
if(foodName=="PavBhaji"){
return 140.00;
}
if(foodName=="VadaPav"){
return 45.00;
}
if(foodName=="Pasta"){
return 220.00;
}
if(foodName=="FrenchFries"){
return 110.00;
}
if(foodName=="Taco"){
return 135.00;
}
if(foodName=="Mojito"){
return 90.00;
}
if(foodName=="PootatoTwister"){
return 110.00;
}
if(foodName=="Gobi"){
return 80.00;
}
if(foodName=="MasalaPuri"){
return 35.00;
}
if(foodName=="Fried Rice"){
return 180.00;
}
if(foodName=="Noodles"){
return 105.00;
}
else{
System.out.println("Food name not found");
}
System.out.println("method end");
return 0.0;
}
}
