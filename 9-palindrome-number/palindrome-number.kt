class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x<0) return false
        if (x<10)return true
        var s=0
        var e="$x".lastIndex

        while(s<e){
            if ("$x"[s]!="$x"[e]){
                return false 
            }
            s++
            e--
        }


        return true


       
        
    }
}