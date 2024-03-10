class Solution {
    val setOfResult = mutableSetOf<Int>()
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        var x = 0
        var firstN = true
        var y = if (nums1.size >= nums2.size) nums1.lastIndex else {
            firstN = false
            nums2.lastIndex
        }
        while (x <= y) {
            if (firstN) {
                checkIsN2(nums1[x], nums2)
                checkIsN2(nums1[y], nums2)
            } else {
                checkIsN2(nums2[x], nums1)
                checkIsN2(nums2[y], nums1)
            }
            x++
            y--
        }
        return setOfResult.toIntArray()
    }

    private fun checkIsN2(n: Int, nums2: IntArray) {
        if (n !in setOfResult) {
            var rightIndex = 0
            while (rightIndex < nums2.size ) {
                if (nums2[rightIndex]==n){
                    setOfResult.add(n)
                    break
                }
                rightIndex++
            }
        }
    }
}