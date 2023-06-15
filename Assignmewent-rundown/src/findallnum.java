import java.util.ArrayList;
import java.util.List;

public class findallnum {


        public List<Integer> findDisappearedNumbers(int[] arr) {
            int i=0;
            while(i<arr.length){
                int correct = arr[i] -1 ;
                if(arr[i] != arr[correct]){
                    swap(arr, i,correct);
                } else {
                    i++;
                }
            }

            List<Integer> ans = new ArrayList<>();

            for (int j = 0; j < arr.length; j++) {
                if(arr[j] != j+1){
                    ans.add(j+1);
                }
            }
            return ans;
        }

    static void swap(int[] arr,int i, int c){
        int temp = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;
    }
}
