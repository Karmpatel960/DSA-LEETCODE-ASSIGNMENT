package Math;

public class Noofdigit {
    public static void main(String[] args) {
        int n =93939;
        int b = 10;
        int ans  = (int)(Math.log(n) /Math.log(b) + 1);

        System.out.println(ans);
    }
}
