package Recursion;

public class tut23_3 {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    private static int fibo(int n){
        if(n <= 1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);

    }
}
