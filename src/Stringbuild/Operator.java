package Stringbuild;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        System.out.println("a"+1);
        System.out.println("a"+"1");
        //this is same as after a few steps: "a" + "1"
        // here above example integer that will be converted in Integer and that will call toString()


        System.out.println("example" + new ArrayList<>());
        System.out.println("example" + new Integer(45));
        String ans = new Integer(34) + "" +new ArrayList<>();
        System.out.println(ans);




    }
}
