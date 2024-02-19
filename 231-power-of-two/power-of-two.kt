class Solution {

    //check if exactly one bit is set in the binary representation of x, which is a characteristic of powers of two
    fun isPowerOfTwo(n: Int): Boolean {
        if (n == 0) return false
        if(n == 1||n==2) return true
        if(n %2  != 0) return false
        return n>0&&(n and (n - 1)) == 0
    }
}
