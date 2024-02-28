class Solution {
    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.size - 1
        while (left <right) {
            val temL = s[left]
            s[left] =  s[right]
            s[right] = temL
            left++
            right--

        }
    }
}