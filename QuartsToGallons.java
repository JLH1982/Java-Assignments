
// QuartsToGallons.java
import java.util.Scanner;

class QuartsToGallons {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quarts needed");
        int quartsNeeded = scanner.nextInt();
        int QUARTS_IN_GALLON = 4;
        int GallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        int remainingQuarts = quartsNeeded % QUARTS_IN_GALLON;

        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + GallonsNeeded + " gallons plus "
                + remainingQuarts + " quarts.");
    }
}