class Solution {
    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.size - 1
        val news = CharArray(s.size)
        while (left < s.size) {
            val temRight = s[right]
            news[left] = temRight
            right--
            left++
        }
        news.copyInto(s)
    }
}