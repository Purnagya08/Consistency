class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        if (k == 1) {
            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int num : nums) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            int ans = -1;

            for (int num : freq.keySet()) {
                if (freq.get(num) == 1) {
                    ans = Math.max(ans, num);
                }
            }

            return ans;
        }

        if (k == n) {
            int ans = nums[0];

            for (int num : nums) {
                ans = Math.max(ans, num);
            }

            return ans;
        }

        int ans = -1;

        boolean uniqueFirst = true;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[0]) {
                uniqueFirst = false;
                break;
            }
        }

        if (uniqueFirst) {
            ans = Math.max(ans, nums[0]);
        }

        boolean uniqueLast = true;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[n - 1]) {
                uniqueLast = false;
                break;
            }
        }

        if (uniqueLast) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}