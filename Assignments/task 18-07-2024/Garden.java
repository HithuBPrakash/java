class Garden {
int gardenId;
String name;
String place;

public boolean createGarden(int gardenId, String name, String place) {
	boolean isCreateGarden = false;
	if (gardenId != 0 && name != null && place != null) {
this.gardenId = gardenId;
this.name = name;
this.place = place;
isCreateGarden = true;
	}
	return isCreateGarden;
}

public void displayGarden() {
	System.out.println("The GardenId is: " + this.gardenId);
	System.out.println("The Name is: " + this.name);
	System.out.println("The Place is: " + this.place);
}
}

