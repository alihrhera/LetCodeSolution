class Solution {
    fun minimumLength(s: String): Int {
        if (s.length == 1) return 1
        if (s.first() != s.last()) return s.length
        var start = 0
        var end = s.lastIndex
        while (start < end&&s[start] == s[end]) {
                val char = s[start]
                while (start <= end && char == s[start]) {
                    start++
                }
                while (start <= end && char == s[end]) {
                    end--
                }
        }
        return end - start + 1
    }
}