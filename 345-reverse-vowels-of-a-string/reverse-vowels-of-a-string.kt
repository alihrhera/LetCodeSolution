class Solution {
    private val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    fun reverseVowels(s: String): String? {
        var start = 0
        var end = s.length - 1
        // Convert String to char array as String is immutable in Java
        val sChar = s.toCharArray()

        // While we still have characters to traverse
        while (start < end) {
            // Find the leftmost vowel
            while (start < end && !isVowel(sChar[start])) {
                start++
            }
            // Find the rightmost vowel
            while (end >= start && !isVowel(sChar[end])) {
                end--
            }
            if (start < end) {
                swap(sChar, start++, end--)
            }
        }

        // Converting char array back to String
        return String(sChar)
    }


    private fun isVowel(c: Char): Boolean {
        return c.lowercaseChar() in vowels
    }

    // Function to swap characters at index x and y
    private fun swap(chars: CharArray, x: Int, y: Int) {
        val temp = chars[x]
        chars[x] = chars[y]
        chars[y] = temp
    }
}