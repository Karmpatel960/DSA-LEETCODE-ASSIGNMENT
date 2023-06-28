package Recursion;

public class tut23_2 {
    public static void main(String[] args) {
        numprint(3);
    }

    private static void numprint(int i ) {
        System.out.println(i);

        if(i == 10) {
            return;
        }
        numprint(i + 1);
    }

    private static void numprint2(int i) {
        System.out.println(i);
        numprint3(i+1);
    }

    private static void numprint3(int i) {
        System.out.println(i);
    }
}
