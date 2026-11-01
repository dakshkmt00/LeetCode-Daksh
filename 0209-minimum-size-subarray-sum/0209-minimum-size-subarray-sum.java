
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0, s = 0;
        int min = nums.length + 1;
        while (r < nums.length) {
            s += nums[r];
            while (s >= target) {
                min = Math.min(min, r - l + 1);
                s -= nums[l];
                l++;
            }
            r++;
        }
        if (min > nums.length) {
            return 0;
        } else {
            return min;
        }
    }
}
