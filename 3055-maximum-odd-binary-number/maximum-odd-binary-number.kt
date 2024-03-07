class Solution {
     fun maximumOddBinaryNumber(s: String): String {
        if (s.length == 1) return s
        val sChar = s.toCharArray()
        Arrays.sort(sChar)
        sChar.reverse()
        for (i in sChar.lastIndex downTo 0) {
            if (sChar[i] == '1') {
                swap(sChar, i, sChar.lastIndex)
                break
            }
        }
        return String(sChar)
    }

    private fun swap(chars: CharArray, x: Int, y: Int) {
        val temp = chars[x]
        chars[x] = chars[y]
        chars[y] = temp
    }
}