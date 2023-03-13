import java.util.*;

public class AcmePay {
    public static void main(String[] args) throws Exception {
        // Write your code here
        double pay, otPay, otHours, otPayRate, retireHold, regularPay;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter shift - 1, 2, or 3");
        int shift = input.nextInt();
        System.out.println("Please enter hours worked");
        double hours = input.nextInt();
        double hoursWorked = hours;
        System.out.println("Do you want to participate in the retirement plan?\n   Enter 1 for yes and 2 for No.");
        int retire = input.nextInt();
        if (shift == 3) {
            if (retire == 1) {
                pay = 22;
                retireHold = .03;
            } else {
                pay = 22;
                retireHold = 0;
            }
        }

        else if (shift == 2) {
            if (retire == 1) {
                pay = 18.50;
                retireHold = .03;
            } else {
                pay = 18.50;
                retireHold = 0;
            }
        }

        else {
            pay = 17;
            retireHold = 0;
        }

        // Pay & OT Pay
        if (hours > 40) {
            otPayRate = (pay / 2) + pay;
            otHours = hours - 40;
            otPay = otPayRate * otHours;
            hours = hours - otHours;
            regularPay = pay * hours;
        }

        else {
            otPay = 0;
            regularPay = pay * hours;
        }

        // Gross Pay
        double grossPay = otPay + regularPay;

        // Retirement deduction
        double deduction = grossPay * retireHold;

        // Net Pay
        double netPay = grossPay - deduction;

        // Output
        System.out.println("1. Hours worked " + hoursWorked);
        System.out.println("2. Hourly pay rate $" + pay);
        System.out.println("3. Regular pay $" + regularPay);
        System.out.println("4. Overtime pay $" + otPay);
        System.out.println("5. Retirement deduction, if any $" + deduction);
        System.out.println("6. Net Pay $" + netPay);
    }

}