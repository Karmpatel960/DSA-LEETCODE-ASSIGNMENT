public class setmismatch {

    public static int[] Number(int[] arr) {
        int i=0;
        while(i<arr.length){
            int c= arr[i];
            if( arr[i] != arr[c]){
                int temp = arr[i];
                arr[i] = arr[c];
                arr[c] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j +1){
                return new int[] { arr[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swap(int[] arr,int i, int c){

    }
}
