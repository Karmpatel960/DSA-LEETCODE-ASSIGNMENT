package Stringbuild;

public class performance {
    public static void main(String[] args) {
        String se = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            se = se+ch;
        }
        System.out.println(se);
    }
}
