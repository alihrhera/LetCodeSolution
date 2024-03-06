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
      fun hasCycle(head: ListNode?): Boolean {
        if (head?.next == null) return false
        val set = mutableSetOf<ListNode?>()
        var mHead = head
        while (mHead !in set) {
            set.add(mHead)
            mHead = mHead?.next
            if (mHead == null) return false
        }
        return true
    }
}