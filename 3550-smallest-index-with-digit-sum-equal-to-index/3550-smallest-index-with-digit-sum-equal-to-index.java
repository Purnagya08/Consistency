class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int digSum = 0;
            while(nums[i] > 0) {
                digSum += nums[i] % 10;
                nums[i] /= 10;
            } if(digSum == i) {
                return i;
            }
        }

        return -1;
    }
}