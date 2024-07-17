class Combination{
public static int factNumber(int num1){
System.out.println("fact started");
int fact=1;
for(int i=1;i<=num1;i++){
fact=i*fact;
}
System.out.println("fact ended");
return fact;
}
}

