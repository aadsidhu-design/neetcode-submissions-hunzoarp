class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int startIndex = m;
        int count = 0;
        for(int i = startIndex; i<nums1.length; i++){
            nums1[i] = nums2[count];
            count++;
        }
        Arrays.sort(nums1);
    }
}