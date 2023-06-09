package Bubble_sort;

import java.util.Arrays;

public class bubblesort_algo {
    public static void main(String[] args) {
        int[] arr = {10, 60, 40, 50, 30, 20};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void bubblesort(int[] arr) {
        boolean swap;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j]<arr[j-1]) {
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                    swap=true;
                    count++;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println(count);
    }
}
