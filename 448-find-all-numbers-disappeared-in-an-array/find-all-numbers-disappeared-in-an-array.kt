class Solution {
     fun findDisappearedNumbers(nums: IntArray): List<Int> {
         val outPutList = mutableListOf<Int>()

        val numsHashSet = nums.toHashSet()
        var start = 1
        var end = nums.size
        while (start < end) {
            if (!numsHashSet.contains(start)) {
                outPutList.add(start)
            }
            if (!numsHashSet.contains(end)) {
                outPutList.add(end)
            }
            start++
            end--
        }
        return outPutList
    }
}