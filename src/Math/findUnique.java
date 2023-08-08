package Math;

public class findUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(isunique(arr));
    }

    private static int isunique(int[] arr) {
        int u =0;

        for(int n : arr){
            u ^= n;
        }
        return u;

    }
}
