package Basic;

import java.util.Scanner;

public class CHARACTER_CHECKER {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            char a = in.next().charAt(0);

            if (Character.isUpperCase(a)) {
                System.out.println("1");
            } else if (Character.isLowerCase(a)) {
                System.out.println("0");
            } else {
                System.out.println("-1");
            }
        }

}
