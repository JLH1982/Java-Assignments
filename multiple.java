class multiple {
    public static void main(String[] args) {
        int x = 0, y = 0, z;
        do {
            do {
                z = x * y;
                System.out.print(x + "*" + y + "=" + z + " ");
                ++y;
            } while (y < 11);
            ++x;
            y = 0;
            System.out.println();
        } while (x < 11);
    }
}