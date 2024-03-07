/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var mHed = head
        var mHedNext = head

        while (mHedNext?.next != null) {
            mHed = mHed?.next
            mHedNext = mHedNext.next?.next
        }

        return mHed
    }
}