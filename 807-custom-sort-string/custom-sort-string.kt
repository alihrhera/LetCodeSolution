class Solution {
    fun customSortString(order: String, s: String): String {
           val charCount = order.associateWith { 0 }.toMutableMap()

        for (char in s) {
            if (char in charCount) {
                charCount[char] = charCount[char]!! + 1
            }
        }

        var sortedS = ""
        for (char in order) {
            sortedS += char.toString().repeat(charCount[char] ?: 0)
        }

        for (char in s) {
            if (char !in order) {
                sortedS += char
            }
        }

        return sortedS
    }
}