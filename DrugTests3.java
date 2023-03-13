public class DrugTests3 {
    // Modify the code below
    public static void main(String[] args) {
        int testedEmployee;
        int week;
        final int WEEKS = 52;
        final int EMPLOYEES = 30;
        int[] counts = new int[EMPLOYEES];
        int countNeverTested = 0;
        int x;
        for (week = 1; week <= WEEKS; ++week) {
            testedEmployee = 1 + (int) (Math.random() * EMPLOYEES);
            System.out.print("week " + week + " Emp # " +
                    testedEmployee + "      ");
            if (week % 4 == 0)
                System.out.println();
            counts[testedEmployee - 1]++;
        }
        for (x = 0; x < EMPLOYEES; ++x) {
            System.out.print("Employee #" + (x + 1) + " is tested " + counts[x] + " time(s).  ");
            if ((x + 1) % 3 == 0)
                System.out.println();
        }
        System.out.println("List of employees never tested during the year:");
        for (x = 0; x < EMPLOYEES; ++x) {
            if (counts[x] == 0) {
                countNeverTested++;
                System.out.print("Emp #" + (x + 1) + "   ");
            }
        }
        if (countNeverTested == 0)
            System.out.println("All employees were tested at least once");
    }
}