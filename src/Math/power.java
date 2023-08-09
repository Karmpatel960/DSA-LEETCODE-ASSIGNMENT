package Math;

public class power {
    public static void main(String[] args) {
        int b = 3;
        int p = 110;

        int ans = 1;
        while(p >0){
            if(((p & 1) ==1)){
                ans *= b;
            }
            b *=b;
            p = p >>1;
        }
        System.out.println(ans);
    }
}
