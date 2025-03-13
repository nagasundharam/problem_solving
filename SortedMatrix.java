public class SortedMatrix {
    public static void main(String a[]) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[] result = search(matrix, 11);
        System.out.println("Element found at: [" + result[0] + ", " + result[1] + "]");
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 1) {
            return binarySearch(matrix, 0, 0, col - 1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;

        while (rStart < rEnd - 1) { // While more than 2 rows remain
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have two rows left, check in the middle column
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in the four sub-matrices
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, col - 1, target);
        }
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        return binarySearch(matrix, rStart + 1, cMid + 1, col - 1, target);
    }

    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1}; // Element not found
    }
}
