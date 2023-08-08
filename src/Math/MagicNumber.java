package Math;

public class MagicNumber {
    public static void main(String[] args) {
        int n =2;
        int a =0;
        int base = 5;
        while(n > 0){
            int l = n & 1;
            n = n>>1;
            a += l *base;
            base = base * 5;
        }

        System.out.println(a);
    }
}
