class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int prefixSum = 0;

        map.put(0, 1);

        for (int num : nums) {
            prefixSum += num;
            int remove = prefixSum - k;

            if (map.containsKey(remove)) {
                count += map.get(remove);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}