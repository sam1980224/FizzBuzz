public class Multiples {
    public static void main(String[] args) {
        int p = 0;
        for (int i = 0; i < 100; i++) {
            if ((i + 1) % 3 == 0 || (i + 1) % 5 == 0) {
                p++;
            }
        }
        System.out.println(p);
    }
}
