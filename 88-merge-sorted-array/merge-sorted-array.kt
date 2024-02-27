class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
         var left = 0
        var right = 0
        val tempArr1 = nums1.clone()
        var i = 0
        while (i < (n + m)) {
            if (left < m && right < n && tempArr1[left] < nums2[right]) {
                nums1[i] = tempArr1[left]
                left++
                println()
            } else if (left < m && right < n && tempArr1[left] > nums2[right]) {
                nums1[i] = nums2[right]
                right++
            } else if (left < m && right < n && tempArr1[left] == nums2[right]) {
                nums1[i] = nums2[right]
                i++
                nums1[i] = tempArr1[left]
                left++
                right++
             }else if (right<n){
                nums1[i] = nums2[right]
                right++
            }else if (left<m){
                nums1[i] = tempArr1[left]
                left++
            }
            i++
        }
    }
}