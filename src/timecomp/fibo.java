package timecomp;

public class fibo {
    public static void main(String[] args) {
        int n = 50;
        for (int i = 0; i < 11; i++) {
            System.out.println(fiboformula(i));
        }
        System.out.println(fiboformula(n));
    }

    private static long fiboformula(int n) {
        return (long)(Math.pow(((1+Math.sqrt(5)) /2 ),n) / Math.sqrt(5));
    }
}
