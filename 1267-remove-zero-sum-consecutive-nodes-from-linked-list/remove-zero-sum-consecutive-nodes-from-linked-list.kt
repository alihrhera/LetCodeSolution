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
    fun removeZeroSumSublists(head: ListNode?): ListNode? {
        val dummy = ListNode(0)
        dummy.next = head
        var prefixSum = 0
        val prefixSumToNode= HashMap<Int, ListNode>()
            var current: ListNode? = dummy
            while (current != null) {
                prefixSum += current.`val`
                if (prefixSumToNode.containsKey(prefixSum)) {
                    val prev: ListNode? = prefixSumToNode[prefixSum]
                    var toRemove = prev?.next
                    var p = prefixSum + (toRemove?.`val` ?: 0)

                    while (p != prefixSum) {
                        prefixSumToNode.remove(p)
                        toRemove = toRemove!!.next
                        p += toRemove?.`val` ?: 0
                    }

                    prev?.next = current.next
                } else {
                    prefixSumToNode.put(prefixSum, current)
                }
                current = current.next
            }
        return dummy.next
    }
}