import java.util.Scanner;

class Dollars {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dollar amount");
        int enterDollar = scanner.nextInt();

        int twentyBills = enterDollar / 20;
        int remainDollar = enterDollar - (twentyBills * 20);
        int tenBills = remainDollar / 10;
        int remainDollar1 = remainDollar - (tenBills * 10);
        int fiveBills = remainDollar1 / 5;
        int remainDollar2 = remainDollar1 - (fiveBills * 5);
        int oneBills = remainDollar2 / 1;
        System.out.println("$" + enterDollar + " converted is " + twentyBills + " $20s, " + tenBills + " $10s, "
                + fiveBills + " $5s, and " + oneBills + " $1s.");
    }
}