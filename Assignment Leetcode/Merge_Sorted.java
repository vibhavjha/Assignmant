// 88 Merge Sorted Array


public class Merge_Sorted{
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p2 >= 0) {

            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            }
            else {
                nums1[p] = nums2[p2];
                p2--;
            }

            p--;
        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}