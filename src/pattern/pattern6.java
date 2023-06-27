package pattern;

public class pattern6 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){
        for (int row = 0; row < 2*n+1; row++) {
            int c = row > n ? 2* n-row: row;
            //for every row run the col


            int nc = n - c;

            for (int i = 0; i < nc; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= c; col++) {
                System.out.print("* ");
            }
            //when one row is print we neeed to print two line
            System.out.println();
        }
    }
}
