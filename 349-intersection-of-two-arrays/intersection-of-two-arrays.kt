class Solution {
    val setOfResult = mutableSetOf<Int>()
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        var x = 0
        var firstN = true
        val n1ToSet = nums1.toSet()
        val n2ToSet = nums2.toSet()

        var y = if (n1ToSet.size >= n2ToSet.size) (n1ToSet.size - 1) else {
            firstN = false
            (n2ToSet.size - 1)
        }

        while (x <= y) {
            if (firstN) {
                checkIsN2(n1ToSet.elementAt(x), n2ToSet)
                checkIsN2(n1ToSet.elementAt(y), n2ToSet)
            } else {
                checkIsN2(n2ToSet.elementAt(x), n1ToSet)
                checkIsN2(n2ToSet.elementAt(y), n1ToSet)
            }
            x++
            y--
        }
        return setOfResult.toIntArray()
    }

    private fun checkIsN2(n: Int, nums2: Set<Int>) {
        if (n !in setOfResult) {
            var rightIndex = 0
            while (rightIndex < nums2.size) {
                if (nums2.elementAt(rightIndex)== n) {
                    setOfResult.add(n)
                    break
                }
                rightIndex++
            }
        }
    }
}