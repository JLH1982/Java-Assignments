import java.util.Scanner;

class Eggs {
    public static void main(String[] args) {
        // Write your code here
        // User input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many eggs would you like? ");
        int eggs = scanner.nextInt();
        // Declaring variables.
        int dozen = eggs / 12;
        float dozenPrice = 3.25f;
        float dozenCost = dozen * dozenPrice;
        int looseEggs = eggs % 12;
        float singlePrice = .45f;
        float singleCost = looseEggs * singlePrice;
        float total = dozenCost + singleCost;
        // Formatting numbers for print statement.
        float formatPrice = singlePrice * 100;
        String formatSinPrice = String.format("%.0f", formatPrice);
        String formatTotal = String.format("%.2f", total);
        System.out.println(
                "You ordered " + eggs + " eggs. That's " + dozen + " dozen at $" + dozenPrice + " per dozen and "
                        + looseEggs + " loose eggs at " + formatSinPrice + " cents each for a total of $" + formatTotal
                        + ".");
    }
}
