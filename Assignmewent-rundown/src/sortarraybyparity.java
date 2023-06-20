public class sortarraybyparity {
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int odd = 0;
            int even = 0;
            int temp;
            while(even < nums.length) {
                if((nums[even] & 1) == 0) {
                    temp = nums[even];
                    nums[even] = nums[odd];
                    nums[odd++] = temp;
                }
                even++;
            }
            return nums;
        }
    }
}
