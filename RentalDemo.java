
// RentalDemo.java
import java.util.Scanner;

public class RentalDemo {

    public static Rental findLonger(Rental a, Rental b) {
        int aH = a.getHours();
        int aM = a.getMinutes();
        int bH = b.getHours();
        int bM = b.getMinutes();

        if (aH > bH) {
            return a;
        } else if (bH > aH) {
            return b;
        } else {
            if (aM > bM) {
                return a;
            } else {
                return b;
            }
        }
    }

    public static void main(String[] args) {
        int count = 3;

        Scanner s = new Scanner(System.in);
        Rental rentalObjects[] = new Rental[3];

        for (int i = 0; i < count; i++) {

            System.out.println("Rental Object " + (i + 1));
            System.out.print("Enter the contract name:");
            String contract = s.next();
            System.out.print("Enter the number of minutes: ");
            int number_of_minutes = s.nextInt();

            rentalObjects[i] = new Rental(contract, number_of_minutes);
            System.out.println("Calculated Rental Price: "
                    + rentalObjects[i].rentalPrice() + "\n");
        }

        for (int i = 0; i < count; i++) {
            Rental a = rentalObjects[i];
            Rental b = rentalObjects[(i + 1) % count];
            System.out.println("\nComparing Rental:" + a.getContract() + " with Rental:" + b.getContract());
            Rental longerRental = findLonger(a, b);
            System.out.println(longerRental.getContract() + " is Longer.");
            System.out.println("Duration: " + longerRental.getDuration());
        }
    }

}