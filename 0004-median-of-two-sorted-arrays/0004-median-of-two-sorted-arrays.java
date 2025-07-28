class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merArr = new int[nums1.length + nums2.length];
        int idx = 0, i = 0, j = 0;
        double ans = 0.0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                merArr[idx++] = nums1[i++];
            else
                merArr[idx++] = nums2[j++];
        }
        while (i < nums1.length) {
            merArr[idx++] = nums1[i++];
        }
        while (j < nums2.length) {
            merArr[idx++] = nums2[j++];
        }
        int mid = (merArr.length)/2;
        if (merArr.length % 2 != 0) {
            ans = merArr[mid];
        } else {
            ans = (merArr[mid-1] + merArr[mid]) / 2.0;
        }
        return ans;
    }
}