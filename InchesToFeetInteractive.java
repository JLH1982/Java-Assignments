import java.util.Scanner;

class InchesToFeetInteractive {
    public static void main(String[] args) {
        // Modify the code below
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter inches");
        int inches = scanner.nextInt();
        final int INCHES_IN_FOOT = 12;
        int feet;
        int inchesLeft;
        feet = inches / INCHES_IN_FOOT;
        inchesLeft = inches % INCHES_IN_FOOT;
        System.out.println(inches + " inches is " +
                feet + " feet and " + inchesLeft + " inches");
    }
}