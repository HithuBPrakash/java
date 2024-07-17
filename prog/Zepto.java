class Zepto{
public static double takeOrder(String foodName){
System.out.println("method started");
if(foodName=="Apple"){
return 30.00;
}
if(foodName=="Banana"){
return 50.00;
}
if(foodName=="Carrot"){
return 40.00;
}
if(foodName=="Dates"){
return 100.00;
}
if(foodName=="Eggs"){
return 60.00;
}
if(foodName=="Milk"){
return 70.00;
}
if(foodName=="Bread"){
return 45.00;
}
if(foodName=="Yogurt"){
return 90.00;
}
if(foodName=="Chicken"){
return 150.00;
}
if(foodName=="Orange Juice"){
return 110.00;
}
if(foodName=="Potato"){
return 20.00;
}
if(foodName=="Tomato"){
return 30.00;
}
if(foodName=="Cheese"){
return 80.00;
}
if(foodName=="Butter"){
return 120.00;
}
if(foodName=="Broccoli"){
return 70.00;
}
else{
System.out.println("Food name not found");
}
System.out.println("method end");
return 0.0;
}
}
