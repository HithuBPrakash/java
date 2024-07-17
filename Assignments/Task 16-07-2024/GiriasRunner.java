class GiriasRunner{
public static void main(String args[]){
	
boolean myAppliances = Girias.createHomeAppliance("Refrigerator");
myAppliances = Girias.createHomeAppliance("Washing Machine");
myAppliances = Girias.createHomeAppliance("Microwave Oven");
myAppliances = Girias.createHomeAppliance("Air Conditioner");
myAppliances = Girias.createHomeAppliance("Dishwasher");
myAppliances = Girias.createHomeAppliance("Water Heater");
myAppliances = Girias.createHomeAppliance("Vacuum Cleaner");
myAppliances = Girias.createHomeAppliance("Electric Kettle");
myAppliances = Girias.createHomeAppliance("Coffee Maker");
myAppliances = Girias.createHomeAppliance("Mixi");
myAppliances = Girias.createHomeAppliance("Toaster");
myAppliances = Girias.createHomeAppliance("Iron");

if(myAppliances == true){
System.out.println("Enter the Appliances:");
}

Girias.getHomeAppliances();

boolean TheAppliance=Girias.updateAppliance("Mixi","Coffee maker");
System.out.println(TheAppliance);
Girias.getHomeAppliances();

boolean MyAppliance=Girias.deleteAppliance("Toaster");
System.out.println(MyAppliance);
Girias.getHomeAppliances();

}
}