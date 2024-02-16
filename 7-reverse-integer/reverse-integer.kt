class Solution {
    fun reverse(x: Int): Int {
   if (x == 0) return 0
    return try {
        if (x > 0) "${abs(x)}".reversed().toInt() else (-1 * "${abs(x)}".reversed().toInt())
    } catch (e: Throwable) {
        0
    }
}
}