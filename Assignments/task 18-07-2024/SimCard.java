class SimCard {
int id;
String name;
String plan;

public boolean createSimCard(int id, String name, String plan) {
boolean isCreateSimCard = false;
if (id != 0 && name != null && plan != null) {
	this.id = id;
	this.name = name;
	this.plan = plan;
	isCreateSimCard = true;
}
return isCreateSimCard;
}

public void displaySimCard() {
System.out.println("The SimCard Id is: " + this.id);
System.out.println("The Name is: " + this.name);
System.out.println("The Plan is: " + this.plan);
}
}

