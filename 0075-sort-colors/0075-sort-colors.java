class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int lp = 0;
        int mid = 0;
        int rp = n - 1;

        while (mid <= rp) {
            if (nums[mid] == 0) {
                swap(nums, mid, lp);
                lp++;
                mid++;
            } 
            else if (nums[mid] == 2) {
                swap(nums, mid, rp);
                rp--;
            } else {
                mid++;
            }
        }
    }

    private void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}