class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        int startRow = 0;
        int startCol = 0;
        int endRow = m - 1;
        int endCol = n - 1;

        while(startRow <= endRow && startCol <= endCol) {
            for(int j = startCol; j <= endCol; j++) {
                list.add(arr[startRow][j]);
            }
            for(int i = startRow + 1; i <= endRow; i++) {
                list.add(arr[i][endCol]);
            }
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    list.add(arr[endRow][j]);
                }
            }

            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    list.add(arr[i][startCol]);
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return list;
    }
}