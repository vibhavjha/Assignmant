// 74. Search a 2D Matrix

// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.


public class Search_in_2D_Matrix{
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        boolean found = false;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                found = true;
                break;
            }
            else if (matrix[row][col] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println(found);
    }
}