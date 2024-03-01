class Solution {
     fun maximumOddBinaryNumber(s: String): String {
        if (!s.all { it == '1' || it == '0' }) throw Exception("Only 1 and 0 accepted")
        if (s.length == 1) return s
        val sChar = s.toCharArray()
        if (s.count { it == '1' } == 1) {
            swap(sChar, sChar.lastIndex, sChar.indexOfFirst { it == '1' })
            return String(sChar)
        }
        var lastItemIs1 = sChar.last() == '1'
        var index = if (lastItemIs1) sChar.lastIndex - 1 else sChar.lastIndex
        while (index >= 0) {
            if (!lastItemIs1) {
                swap(sChar,sChar.indexOfLast { it=='1' },sChar.lastIndex)
                lastItemIs1 = sChar.last() == '1'
            } else {
                if (sChar[index] == '1') {
                    var i = index
                    while (i > -1) {
                        if (sChar[i] == '0') break
                        i--
                    }
                    if (i in sChar.indices) swap(sChar, index, i)
                }
            }
            index--
        }
        return String(sChar)
    }

    private fun swap(chars: CharArray, x: Int, y: Int) {
        val temp = chars[x]
        chars[x] = chars[y]
        chars[y] = temp
    }
    
}
