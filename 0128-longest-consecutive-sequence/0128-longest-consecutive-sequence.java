class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);

        int prev = nums[0];
        int n = nums.length;
        int ans = 1, len = 1;

        for(int i = 1; i < n; i++) {
            if(nums[i] == prev) {
                continue;
            }
            if(nums[i] == prev + 1) {
                len++;
            } else if(nums[i] != prev + 1) {
                len = 1;
            }
            prev = nums[i];
            ans = Math.max(ans, len);
        }

        return ans;
    }
}