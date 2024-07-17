package prog;


class invoice {
    static int billid=101;
    static String issueDate="10/09/2023";
    static String dueDate="23/6/2024";
    static boolean isBillpaid=true;
    static boolean isLatestbill=false;

    public static void main(String args[]) {
    
        System.out.println("-------------------------");
        System.out.println("The bill id is: "+billid);
        System.out.println("The issue date is: "+issueDate);
        System.out.println("The due date is: "+dueDate);
        System.out.println(isBillpaid);
        System.out.println(isLatestbill);
    System.out.println("-------------------------");
}
}



