class PermutationTester{
public static void main(String args[]){
System.out.println("main started");
int f=5;
int r=3;
int permutationNumber=Permutation.factNumber(f)/Permutation.factNumber(f-r);
System.out.println("The permutation number is :"+permutationNumber);
System.out.println("main ended");
}
}

