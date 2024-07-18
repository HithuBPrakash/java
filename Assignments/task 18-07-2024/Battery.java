class Battery {
int id;
String name;
double weight;

public boolean createBattery(int id, String name, double weight) {
boolean isCreateBattery = false;
if (id != 0 && name != null && weight != 0.0) {
this.id = id;
this.name = name;
this.weight = weight;
isCreateBattery = true;
}
return isCreateBattery;
}

public void displayBattery() {
System.out.println("The Battery Id is: " + this.id);
System.out.println("The Name is: " + this.name);
System.out.println("The Weight is: " + this.weight);
}
}

