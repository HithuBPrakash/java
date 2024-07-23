lass Library{
 int numberOfBooks;
 String location;
 String librarianName;
 String name;
 String membershipType;
 public Library(){
 System.out.println("Library creation started");
 }
 public Library(int numberOfBooks,String location,String librarianName,String name,String membershipType){
 System.out.println("parameterised constructor started");
 this.numberOfBooks=numberOfBooks;
 this.location=location;
 this.librarianName=librarianName;
 this.name=name;
 this.membershipType=membershipType;
 }
 public void getDetails(){
 System.out.println("The number of books is:"+this.numberOfBooks);
System.out.println("The location is:"+this.location);
System.out.println("The librarian name is:"+this.librarianName);
System.out.println("The name is:"+this.name);
System.out.println("The membership type is:"+this.membershipType);
 }
}