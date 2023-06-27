package pattern;

public class pattern44 {
    public static void main(String[] args) {
    pattern(4);
}

    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            //for every row run the col
            for (int col = 1; col <= n-row+1;col++) {
                System.out.print("* ");
            }
            //when one row is print we neeed to print two line
            System.out.println();
        }
    }


}
