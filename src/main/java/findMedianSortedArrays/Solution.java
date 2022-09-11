package findMedianSortedArrays;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = 0;
        int n = 0;
        int med1 = 0;
        int med2 = 0;
        for (int i = 0; i <= (nums1.length + nums2.length) / 2; i++) {
            med1= med2;
            if (m == nums1.length) {
                med2 = nums2[n];
                n++;
            } else if (n == nums2.length) {
                med2 = nums1[m];
                m++;
            } else if (nums1[m] < nums2[n]) {
                med2 = nums1[m];
                m++;
            } else {
                med2 = nums2[n];
                n++;
            }
        }
        if ((nums1.length + nums2.length) % 2 == 0) {
            return (med1 + med2) / 2.0;
        }
        return med2;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));



    }
}
