class Solution {
     fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val intersectSet: HashSet<Int> = nums1.toHashSet()
        val result: MutableSet<Int> = hashSetOf()
        var x = 0
        var y = nums2.lastIndex
        while (x <= y) {
            if (intersectSet.contains(nums2[x])) {
                result.add(nums2[x])
            }
            if (intersectSet.contains(nums2[y])) {
                result.add(nums2[y])
            }
            x++
            y--
        }

        return result.toIntArray()
    }
}