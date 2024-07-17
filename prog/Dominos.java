class Dominos{
public static double takeOrder(String foodName){
	double price=0.0;
System.out.println("method started");
if(foodName=="Paneer Tikka Pizza"){
price= 350.00;
}
if(foodName=="Veggie Paradise Pizza"){
price= 300.00;
}
if(foodName=="Peppy Paneer Pizza"){
return 320.00;
}
if(foodName=="Chicken Tikka Pizza"){
return 400.00;
}
if(foodName=="Chicken Sausage Pizza"){
return 380.00;
}
if(foodName=="Margherita Pizza"){
return 250.00;
}
if(foodName=="Cheese Burst Pizza"){
return 370.00;
}
if(foodName=="Farmhouse Pizza"){
price= 330.00;
}
if(foodName=="Mexican Green Wave Pizza"){
return 360.00;
}
if(foodName=="Garlic Breadsticks"){
return 120.00;
}
if(foodName=="Cheesey Dip"){
return 50.00;
}
if(foodName=="Choco Lava Cake"){
return 150.00;
}
if(foodName=="Burger Pizza"){
return 180.00;
}
else{
System.out.println("Food name not found");
}
return price;
}
public static double takeOrder(String foodName,int quantity){
	if(foodName=="Burger pizza"){
		return 180.00*quantity;
	}
	if(foodName=="Margherita Pizza"){
		return 250.00*quantity;
	}
	return 0.0;
}

}

