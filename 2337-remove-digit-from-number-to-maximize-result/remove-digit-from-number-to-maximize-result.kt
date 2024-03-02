class Solution {
    fun removeDigit(number: String, digit: Char): String {
       var largestNum = 0.toBigInteger()
        var i = 0
        var j = number.lastIndex
        while ((i-1)< j) {
            if (number[i] == digit) {
                val num =
                 (number.substring(0,i)+number.substring(i+1)).toBigInteger()
                if (num > largestNum) {
                    largestNum = num
                }
            }
            if (number[j] == digit) {
                val num = 
                (number.substring(0,j)+number.substring(j+1)).toBigInteger()
                if (num > largestNum) {
                    largestNum = num
                }
            }
            i++
            j--
        }
        return largestNum.toString()
    }
}