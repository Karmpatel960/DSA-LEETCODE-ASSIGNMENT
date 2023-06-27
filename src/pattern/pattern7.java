package pattern;

public class pattern7 {
    public static void main(String[] args) {
//        patternn(5);
        pattern2(5);
    }

    private static void patternn(int n) {
        for (int row = 1; row <= n; row++) {

            for (int spc = 0; spc < n - row; spc++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row >n ? 2* n - row : row;


            for (int spc = 0; spc < n - c; spc++) {
                System.out.print(" ");
            }
            for (int col = c; col >= 1 ; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
