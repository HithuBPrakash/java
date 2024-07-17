class FoodPanda{
public static double takeOrder(String foodName){
System.out.println("method started");
if(foodName=="Dimsum"){
return 350.00;
}
if(foodName=="Sushi"){
return 300.00;
}
if(foodName=="Burritos"){
return 460.00;
}
if(foodName=="Nachos"){
return 245.00;
}
if(foodName=="pad Thai noodles"){
return 550.00;
}
if(foodName=="Cheesecake"){
return 170.00;
}
if(foodName=="Caesar salad"){
return 355.00;
}
if(foodName=="Tiramisu"){
return 210.00;
}
if(foodName=="Club sandwich"){
return 330.00;
}
if(foodName=="Quesadillas"){
return 290.00;
}
if(foodName=="Samosas"){
return 80.00;
}
if(foodName=="Quinoa salad"){
return 80.00;
}
if(foodName=="Chocolate Milkshake"){
return 90.00;
}
if(foodName=="Hummus and Peta Bread"){
return 520.00;
}
if(foodName=="Croissant"){
return 130.00;
}
else{
System.out.println("Food name not found");
}
System.out.println("method end");
return 0.0;
}
}
