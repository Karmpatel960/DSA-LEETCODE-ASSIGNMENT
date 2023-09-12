public class oneton {
    public static int[] printNos(int x) {
        int[] arr = new int[x];

         return func(x,arr);

    }

    static int[] func(int x, int[] arr){
            if(x == 0) return arr;

            int i = x;
            arr[i-1] = x;
            // Function call to print i till i ncrements to n.
            return func(x-1,arr);

    }
}
