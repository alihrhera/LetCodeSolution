class Solution {
     fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val intersectSet: HashSet<Int> = hashSetOf()
        val result: MutableSet<Int> = hashSetOf()
        var x = 0
        var y = nums1.lastIndex
        while (x <= y) {
            intersectSet.add(nums1[x])
            intersectSet.add(nums1[y])
            x++
            y--
        }

        x = 0
        y = nums2.lastIndex
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