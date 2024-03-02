class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var s = 0
        var e = nums.lastIndex
        for (i in result.lastIndex downTo 0) {
            result[i] = if (Math.abs(nums[s]) > Math.abs(nums[e])) {
                nums[s++].let { it * it }
            } else nums[e--].let { it * it }
        }
        return result
    }
    
}