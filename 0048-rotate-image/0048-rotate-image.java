class Solution {
    public void rotate(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0; i < m; i++) {
            int ptr1 = 0;
            int ptr2 = n - 1;
            while (ptr1 < ptr2) {
                int temp = arr[i][ptr1];
                arr[i][ptr1] = arr[i][ptr2];
                arr[i][ptr2] = temp;
                ptr1++;
                ptr2--;
            }
        }
    }
}