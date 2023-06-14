package Sorting;

/* CYCLIC SORT ALGORITHM
0,1,2,3,4
3,5,2,1,4 here index = 5

When given number from range 1,N then use Cyclic sort

index = values - 1;
because here index is starting from 0.

3,5,2,1,4
2,5,3,1,4
5,2,3,1,4
4,2,3,1,5
1,2,3,4,5
*/


import java.util.Arrays;

public class cyclicsort {
    public static void  main(String[] args) {
         int[] arr = {3,5,2,1,4};
         sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i,correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int i, int c){
        int temp = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;
    }
}
