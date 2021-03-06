/**
Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.

Note:

Given n will always be valid.

Follow up:

Could you do this in one pass? 
*/

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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var n = n
        
        if(head == null) {
            return null
        }
        
        var slow = head
        var fast = head
        
        while(n --> 0) {                     
            fast = fast!!.next
        }
        
        if(fast == null) { 
            return head.next
        }
        
        while(fast!!.next != null){          
            fast = fast!!.next
            slow = slow!!.next
        }
        
        slow!!.next = slow.next.next
        return head
    }
}