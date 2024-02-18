class Solution {
    fun romanToInt(s: String): Int {
          if (s.length !in 1..15) throw Exception("String length must be >=1 and <=15")
        val startTime = System.currentTimeMillis()
        val romanCharValues = mapOf(
            "I" to 1,
            "II" to 2,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000,
            "IV" to 4,
            "IX" to 9,
            "XL" to 40,
            "XC" to 90,
            "CD" to 400,
            "CM" to 900,
        )
        val getAsPair = arrayOf("IV", "IX", "XL", "XC", "CD", "CM")

        if (!s.all { "$it" in romanCharValues.keys }) throw Exception("we can only accept 'I', 'V', 'X', 'L', 'C', 'D', 'M'")
        val newList = ArrayList<String>()
        var i = 0
        while (i in s.indices) {
            var txt = "${s[i]}"
            if (i + 1 in s.indices) {
                if ("${s[i]}${s[i + 1]}" in getAsPair) {
                    txt = "${s[i]}${s[i + 1]}"
                    i++
                }
            }
            newList.add(txt)
            i++
        }
        var valueOfRoman = 0
        newList.forEach {
            val charValues = romanCharValues[it]
            charValues?.let { value ->
                valueOfRoman += value
            }
        }
        val endTime = System.currentTimeMillis()


        print("${endTime - startTime} ms to get value of $s = $valueOfRoman \n")

        return valueOfRoman
    }
}