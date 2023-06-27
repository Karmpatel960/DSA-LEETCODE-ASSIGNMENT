package pattern;

public class pattern9 {
    public static void main(String[] args) {
        patternsqr(4);
    }

    private static void patternsqr(int n) {
        int on = n;
        n = 2* n;
        for (int row = 0; row <= n ; row++) {
            for (int col = 0; col <= n; col++) {
                int in = on -  Math.min(Math.min(row,col),Math.min(n-col,n-row));
                System.out.print(in + " ");
                
            }
            System.out.println();
        }
    }
}
