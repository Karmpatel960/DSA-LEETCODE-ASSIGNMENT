public class sumofn {
    public class Solution {
        public static long sumFirstN(long n) {
            if(n == 0) return 0;
    
            return n + sumFirstN(n - 1);
        }
    }
    
}
