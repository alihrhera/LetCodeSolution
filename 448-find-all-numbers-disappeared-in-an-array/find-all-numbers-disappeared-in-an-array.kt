class Solution {
     fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val outPutList = mutableListOf<Int>()
        var start = 1
        var end = nums.size

        while (start < end) {
            if (start !in nums) outPutList.add(start)
            if (end   !in nums) outPutList.add(end)
            start++
            end--
        }
        return outPutList
    }
}