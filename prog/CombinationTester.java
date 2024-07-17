class CombinationTester{
public static void main(String args[]){
System.out.println("main started");
int f=5;
int r=3;
int combinationNumber=Combination.factNumber(f)/Combination.factNumber(f-r)*Combination.factNumber(r);
System.out.println("The permutation number is :"+combinationNumber);
System.out.println("main ended");
}
}

