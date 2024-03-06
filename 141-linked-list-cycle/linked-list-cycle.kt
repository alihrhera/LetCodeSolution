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
         var mHead = head
        var myNext = head.next
        while (mHead != null && myNext?.next != null) {
            if (mHead == myNext) return true
            mHead = mHead?.next
            myNext = myNext?.next?.next
        }
        return false
    }
}