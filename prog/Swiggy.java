class Swiggy{
public static double takeOrder(String foodName){
System.out.println("method started");
if(foodName=="Idli"){
return 20.00;
}
if(foodName=="Vada"){
return 30.00;
}
if(foodName=="Dosa"){
return 60.00;
}
if(foodName=="Upma"){
return 45.00;
}
if(foodName=="KesariBath"){
return 50.00;
}
if(foodName=="BisiBeleBath"){
return 70.00;
}
if(foodName=="Pongal"){
return 55.00;
}
if(foodName=="AkkiRotti"){
return 110.00;
}
if(foodName=="RagiRotti"){
return 130.00;
}
if(foodName=="Puliyogare"){
return 90.00;
}
if(foodName=="LemonRice"){
return 80.00;
}
if(foodName=="Gobi"){
return 80.00;
}
if(foodName=="Pulav"){
return 50.00;
}
if(foodName=="Paratha"){
return 120.00;
}
if(foodName=="Poha"){
return 75.00;
}
else{
System.out.println("Food name not found");
}
System.out.println("method end");
return 0.0;
}
public static double takeOrder(String foodName,int quantity){//method overloading
	if(foodName=="Poha"){
		return 75.00*quantity;
	}
	if(foodName=="Paratha"){
 double price=Swiggy.takeOrder("Paratha")*quantity;
		return price;
	}
	if(foodName=="Pulav"){
	double	price= 50.00*quantity;
		return price;
	}
return 0.0;
}

}
