class Solution {
    public void setZeroes(int[][] arr) {
        boolean firstRowZero = false;
        boolean firstColZero = false;

        int m = arr.length;
        int n = arr[0].length;

        for(int j = 0; j < n; j++) {
            if(arr[0][j] == 0) {
                firstRowZero = true;
            }
        }
        for(int i = 0; i < m; i++) {
            if(arr[i][0] == 0) {
                firstColZero = true;
            }
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(arr[0][j] == 0 || arr[i][0] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }
} 