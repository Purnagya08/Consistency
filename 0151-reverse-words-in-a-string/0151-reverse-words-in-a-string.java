class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        int start = 0;

        while (start < arr.length) {

            while (start < arr.length && arr[start] == ' ')
                start++;

            if (start >= arr.length)
                break;

            int end = start;

            while (end < arr.length && arr[end] != ' ')
                end++;

            int l = start;
            int r = end - 1;

            while (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

            start = end;
        }

        return new String(arr);
    }
}