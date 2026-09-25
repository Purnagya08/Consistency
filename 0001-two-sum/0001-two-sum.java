class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int subs = target - nums[i];

            if (map.containsKey(subs)) {
                return new int[] { map.get(subs), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}