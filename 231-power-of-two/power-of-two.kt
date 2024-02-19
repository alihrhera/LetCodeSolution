class Solution {

    fun isPowerOfTwo(n: Int): Boolean {
        if (n == 0) return false
        if(n == 1||n==2) return true
        if(n %2  != 0) return false
        return n>0&&(n and (n - 1)) == 0
    }
}