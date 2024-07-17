package prog;

public class bill {
    public static void main(String[] args) {
        int billid=101;
        String issueDate="10/09/2023";
        String dueDate="23/6/2024";
        boolean isBillpaid=true;
        boolean isLatestbill=false;
        System.out.println("-------------------------");
        System.out.println("The bill id is: "+billid);
        System.out.println("The issue date is: "+issueDate);
        System.out.println("The due date is: "+dueDate);
        System.out.println(isBillpaid);
        System.out.println(isLatestbill);
        System.out.println("-------------------------");
    }
}
