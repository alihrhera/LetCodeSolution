class Solution {
    fun romanToInt(s: String): Int {
        if (s.length !in 1..15) throw Exception("String length must be >=1 and <=15")
        var newTxt = s
        val romanCharValues = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000,
        )
        newTxt =
            newTxt.replace("IV", "IIII")
            .replace("IX", "VIIII")
            .replace("XL", "XXXX")
            .replace("XC", "LXXXX")
            .replace("CD", "CCCC")
            .replace("CM", "DCCCC")
        if (!newTxt.all { it in romanCharValues.keys }) throw Exception("we can only accept 'I', 'V', 'X', 'L', 'C', 'D', 'M'")
        var valueOfRoman = 0
        newTxt.forEach {
            romanCharValues[it]?.let { value ->
                valueOfRoman += value
            }
        }
        println("Value of $s->>$newTxt is-> $valueOfRoman")
        return valueOfRoman
    }
}