
// 33. Search in Rotated Sorted Array

// There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4

public class Search_Rotated_Sorted_Array_33{
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int left = 0;
        int right = arr.length - 1;

        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target mil gaya
            if (arr[mid] == target) {
                answer = mid;
                break;
            }

            // Left part sorted hai
            if (arr[left] <= arr[mid]) {

                // Target left sorted part ke andar hai
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }

            // Right part sorted hai
            else {

                // Target right sorted part ke andar hai
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }

        System.out.println(answer);
    }
}