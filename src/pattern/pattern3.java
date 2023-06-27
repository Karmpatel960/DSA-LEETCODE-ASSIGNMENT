package pattern;

/*
*
*
* 1
12
123
1234
12345
* */
public class pattern3 {
    public static void main(String[] args) {
        pattern(6);
    }

    static void pattern(int n){
        for (int row = 0; row < n; row++) {
            //for every row run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            //when one row is print we neeed to print two line
            System.out.println();
        }
    }
}
