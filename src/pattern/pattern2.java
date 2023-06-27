package pattern;

public class pattern2 {
    public static void main(String[] args) {
        pattern(6);
    }

    static void pattern(int n){
        for (int row = 0; row < n; row++) {
            //for every row run the col
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            //when one row is print we neeed to print two line
            System.out.println();
        }
    }
}
