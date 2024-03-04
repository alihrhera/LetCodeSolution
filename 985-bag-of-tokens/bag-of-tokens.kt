class Solution {
      fun bagOfTokensScore(tokens: IntArray, power: Int): Int {
        if (tokens.isEmpty()|| tokens.min() > power)return 0
        if (tokens.size == 1) return 1
            tokens.sort()
            val n = tokens.size
            var score = 0
            var maxScore = 0
            var left = 0
            var right = n - 1
            var mPower = power
            while (left <= right) {
                if (mPower >= tokens[left]) {
                    mPower -= tokens[left]
                    score++
                    left++
                    maxScore = maxOf(maxScore, score)
                } else if (score > 0) {
                    mPower += tokens[right]
                    score--
                    right--
                } else {
                    break
                }
            }

            return maxScore
    }
}