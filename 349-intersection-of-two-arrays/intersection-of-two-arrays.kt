class Solution {
      fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val intersectSet: HashSet<Int> = HashSet()
        val result: MutableSet<Int> = hashSetOf()
        for(i in 0..nums1.size - 1) {
            intersectSet.add(nums1[i])
        }
        
        for (i in 0..nums2.size - 1) {
            if (intersectSet.contains(nums2[i])) {
                result.add(nums2[i]) 
            }
        }
        return result.toIntArray()
    }
}