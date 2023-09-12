public class ntoone
{
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] arr = new int[x];
        return rev(x,arr,0);
    }

    static int[] rev(int x,int[] arr,int i){
        if(x <= 0) return arr;
        arr[i] = x;
        return rev(x-1,arr,i+1);
    }
}