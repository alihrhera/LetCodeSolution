class Solution {
    private val listOfChar = mutableListOf<Char>()
    fun minimumLength(s: String): Int {
        if (s.length == 1) return 1
        if (s.first() != s.last()) return s.length
        listOfChar.clear()
        listOfChar.addAll(s.toList())
        var start = 0
        var end = s.lastIndex

        while (start < end) {
            if (s[start] == s[end]) {
                val startChar = s[start]
                val endChar = s[end]
                while (start in s.indices && startChar == s[start]) {
                    val pos = listOfChar.indexOfFirst { it == startChar }
                    if (pos >= 0) listOfChar.removeAt(pos)
                    start++
                }
                while (end in s.indices && endChar == s[end]) {
                    val pos = listOfChar.indexOfLast { it == endChar }
                    if (pos >= 0) listOfChar.removeAt(pos)
                    end--
                }

            } else {
                break
            }
        }
        return listOfChar.size
    }
}