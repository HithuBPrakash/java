class AmusementPark {
String name;
String place;
int noOfGames;
int id;

public boolean createAmusementPark(int id, String name, String place, int noOfGames) {
boolean isCreated = false;
if (id != 0 && name != null && place != null && noOfGames != 0) {
this.id = id;
this.name = name;
this.place = place;
this.noOfGames = noOfGames;
isCreated = true;
}
return isCreated;
}

public void displayAmusementPark() {
System.out.println("The Amusement Park Id is: " + this.id);
System.out.println("The Name is: " + this.name);
System.out.println("The Place is: " + this.place);
System.out.println("The Number of Games is: " + this.noOfGames);
}


}

