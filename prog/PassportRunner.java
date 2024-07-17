class PassportRunner{
public static void main(String args[]){
boolean Mypassport=Passport.createPassport(null,0,"Prakash","Hithu","18/01/2003","hithuprakaash@gmail.com",true,"hithuprakaash@gmail.com","hithu123",
"hithu123","fav color","blue","BCX234");

System.out.println(Mypassport);
Passport.getPassportDetails();
}
}