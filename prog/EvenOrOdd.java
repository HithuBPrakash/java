class EvenOrOdd{


public static String eOrO(int n){
if(n%2==0){
return "even";
}
else{
return "odd";
}
}

public static void main(String args[]){
String number=eOrO(6);
System.out.println(number);
}
}
