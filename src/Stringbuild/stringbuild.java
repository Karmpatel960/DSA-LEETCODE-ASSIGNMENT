package Stringbuild;

import java.util.Arrays;

/*
*
*
*
*   In Java Strings are Immutable and it will not replace any value of string and
*   it will point to new object of memory
*
*
*
* */
public class stringbuild {
    public static void main(String[] args) {
        int a1 =10;
        int[] arr1 = {2,3,4,5,6};
        System.out.println(34);
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5}));
        System.out.println("k");


        // immutable case
//        String n = "Karm";
//        System.out.println(n);
//        n = "K";
//        System.out.println(n);

// == case
//        String c = "abcd";
//        String b = "abcd";
//        // ==
//        System.out.println(c == b); // result true


        // .equal case
        String a = new String("Karm");
        String b = new String("Karm");
        System.out.println(a == b); //result will be false

        System.out.println(a.equals(b)); // result true

        // .charAt case it will give index char in case
        System.out.println(a.charAt(0));



    }
}

