class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int mx = nums[0];
        int currmx = nums[0];
        for(int i = 1; i < n ; i++){
            currmx = Math.max(nums[i], currmx + nums[i]);
            mx = Math.max(mx, currmx);
        }
        return mx;
    }
}