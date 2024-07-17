class BlinkIt{
public static double takeOrder(String foodName){
System.out.println("method started");
if(foodName=="Paneer"){
return 200.00;
}
if(foodName=="Mango"){
return 150.00;
}
if(foodName=="Grapes"){
return 120.00;
}
if(foodName=="Almonds"){
return 350.00;
}
if(foodName=="Spinach"){
return 40.00;
}
if(foodName=="Cucumber"){
return 30.00;
}
if(foodName=="Bell Pepper"){
return 80.00;
}
if(foodName=="Eggs"){
return 60.00;
}
if(foodName=="Chocolate"){
return 150.00;
}
if(foodName=="Pomegranate Juice"){
return 180.00;
}
if(foodName=="Beetroot"){
return 50.00;
}
if(foodName=="Cabbage"){
return 30.00;
}
if(foodName=="Feta Cheese"){
return 120.00;
}
if(foodName=="Olive Oil"){
return 400.00;
}
if(foodName=="Zucchini"){
return 70.00;
}
else{
System.out.println("Food name not found");
}
System.out.println("method end");
return 0.0;
}
}
