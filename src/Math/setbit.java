package Math;

public class setbit {
    public static void main(String[] args) {
        int n =45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbits(n));
    }

    private static int setbits(int n) {

        int count =0;
//        while(n>0){
//            count++;
//            n = ( n &-n);
//        }

        while(n>0){
            count++;
            n = n & (n-1);

        }
        return count;
    }
}
