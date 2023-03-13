public class DrugTests33 {
    // Modify the code below
    public static void main(String[] args) {
        int testedEmployee;
        int week;
        final int WEEKS = 52;
        final int EMPLOYEES = 30;
        int[] counts = new int[EMPLOYEES];
        int countNeverTested = 0;
        int x, y = 0;
        for (week = 1; week <= WEEKS; ++week) {
            testedEmployee = 1 + (int) (Math.random() * EMPLOYEES);
            if (testedEmployee == y) {
                testedEmployee = 1 + (int) (Math.random() * EMPLOYEES);
            }
            System.out.print("week " + week + " Emp # " +
                    testedEmployee + "      ");
            y = testedEmployee;
            if (week % 4 == 0)
                System.out.println();
            counts[testedEmployee - 1]++;
        }
    }
}