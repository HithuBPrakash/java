class Sunglasses{
String brand;
String model;
double price;
String color;
String frameMaterial;
public Sunglasses(){
System.out.println("Sunglasses creation started");
}
public Sunglasses(String brand,String model,double price,String color,String frameMaterial){
 System.out.println("parameterised constructor started");
 this.brand=brand;
 this.model=model;
 this.price=price;
 this.color=color;
 this.frameMaterial=frameMaterial;
}
public void getDetails(){
System.out.println("The brand is:"+this.brand);
System.out.println("The model is:"+this.model);
System.out.println("The price is:"+this.price);
System.out.println("The color is:"+this.color);
System.out.println("The frame material is:"+this.frameMaterial);
}
}

