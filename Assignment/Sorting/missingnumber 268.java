class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 2, 1, 4};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));
    }
    public int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i,correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
         return arr.length;
        }
    }

    static void swap(int[] arr,int i, int c){
        int temp = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;
    }
}