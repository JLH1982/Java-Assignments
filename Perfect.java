public class Perfect {
    public static void main(String args[]) {
        // Write your code here
        for (int num = 1; num <= 1000; num++) {
            if (perfect(num)) {
                System.out.println(num + " ");
            }
        }
    }

    public static boolean perfect(int num) {
        // Write your code here
        int sum = 0;
        for (int factor = 1; factor < num; factor++) {
            if (num % factor == 0) {
                sum += factor;
            }
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }
}