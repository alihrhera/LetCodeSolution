class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        for (i in 0..nums.lastIndex) {
            nums[i] = nums[i] * nums[i]
            var j = i
            while (j - 1 > -1 && nums[j] < nums[j - 1]) {
                swap(nums, j, j - 1)
                j--
            }
        }
        return nums
    }
    private fun swap(arr: IntArray, x: Int, y: Int) {
        val temp = arr[x]
        arr[x] = arr[y]
        arr[y] = temp
    }
}