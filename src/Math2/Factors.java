package Math2;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
//        isfactor(20);
//        isfactor1(25);
        isfactor2(20);
    }


    //o(n)
    static void isfactor(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.println(i +" ");
            }
        }
    }

    //o(sqrt(n))
    static void isfactor1(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if ((n / i) == i) {
                    System.out.println(i + " ");
                } else {
                    System.out.println(i + " " + n / i + " ");
                }
            }
        }
    }

    //o(sqrt(n))
    static void isfactor2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if ((n / i) == i) {
                    System.out.println(i + " ");
                } else {
                    System.out.println(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >=0; i--){

            System.out.println(list.get(i)+ " ");
        }
    }

}
