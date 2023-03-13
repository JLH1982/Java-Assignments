public class DebugSix2 {
    public static void main(String args[]) {
        char letter;
        final int MIN = 65;
        final int MAX = 122;
        final int NUMPERLINE = 200;
        final int STOPLINE1 = 0;
        final int STOPLINE2 = STOPLINE1 + NUMPERLINE;
        for (int a = MIN; a <= MAX; a++) {
            letter = (char) a;
            System.out.print("  " + letter);
            if ((a == STOPLINE1) && (a == STOPLINE2)) {
                System.out.println();
            }
        }
        System.out.println("\nEnd of application");
    }
}