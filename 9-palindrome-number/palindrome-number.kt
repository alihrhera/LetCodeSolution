class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        if (x < 10) return true
        return "$x" == "$x".reversed()
    }
}