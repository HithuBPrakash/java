class RedChilliesEntertainmentRunner{

public static void main(String args[]){

boolean myActors = RedChilliesEntertainment.addMovieActors("Shah Rukh Khan");
myActors = RedChilliesEntertainment.addMovieActors("Kajol");
myActors = RedChilliesEntertainment.addMovieActors("Deepika Padukone");
myActors = RedChilliesEntertainment.addMovieActors("Anushka Sharma");
myActors = RedChilliesEntertainment.addMovieActors("Varun Dhawan");
myActors = RedChilliesEntertainment.addMovieActors("Kriti Sanon");
myActors = RedChilliesEntertainment.addMovieActors("Katrina Kaif");
myActors = RedChilliesEntertainment.addMovieActors("Alia Bhatt");
myActors = RedChilliesEntertainment.addMovieActors("John Abraham");

if(myActors == true){
System.out.println("Enter the Actors:");
}

RedChilliesEntertainment.getMovieActors();

boolean isUpdated=RedChilliesEntertainment.updateActors("Kriti Sanon","Samantha");
System.out.println("The  actors are"+isUpdated);
RedChilliesEntertainment.getMovieActors();

boolean isDeleted=RedChilliesEntertainment.deleteActors("Kajol");
System.out.println("The actors are"+isDeleted);
RedChilliesEntertainment.getMovieActors();
}
}