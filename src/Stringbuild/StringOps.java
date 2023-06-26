package Stringbuild;

import java.util.Arrays;

public class StringOps {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        builder.reverse();
String name = "andj dhdhd";
        System.out.println(builder.toString());
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.indexOf('a'));
        System.out.println("        days today ".strip());
        name.split(" ");
        System.out.println(name);


    }
}
