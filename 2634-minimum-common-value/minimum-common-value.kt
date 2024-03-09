class Solution {
    fun getCommon(nums1: IntArray, nums2: IntArray): Int {
        var i = 0
        var j = 0
        while (i in nums1.indices && j in nums2.indices) {
           if (nums1[i]==nums2[j])return nums2[j]
            else if (nums1[i]<nums2[j])i++
            else j++
        }
        return -1
    }
}