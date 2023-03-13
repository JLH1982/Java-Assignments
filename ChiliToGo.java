import java.util.Scanner;

class ChiliToGo {
    public static void main(String[] args) {
        // Write your code here
        // User input of meals.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of adult meals ordered ");
        int adult = scanner.nextInt();
        System.out.println("Enter number of child meals ordered ");
        int child = scanner.nextInt();
        // Cost of meals.
        double adultMeal = 7.00;
        double adultPrice = adult * adultMeal;
        double childMeal = 4.00;
        double childPrice = child * childMeal;
        double total = adultPrice + childPrice;
        double costAdult = 4.35;
        double costChild = 3.10;
        double adultProfit = adultPrice - (adult * costAdult);
        double childProfit = childPrice - (child * costChild);
        double totalProfit = adultProfit + childProfit;
        // Print order.
        System.out.println(adult + " adult meals were ordered at " + adultMeal + " each.");
        System.out.println("     Total is " + adultPrice);
        System.out.println(child + " child meals were ordered at " + childMeal + " each.");
        System.out.println("     Total is " + childPrice);
        System.out.println("Grand total for all meals is " + total);
        System.out.println("Profits:");
        System.out.println("     Adult profit is " + adultProfit);
        System.out.println("     Child profit is " + childProfit);
        System.out.println("Total profit is " + totalProfit);
    }
}