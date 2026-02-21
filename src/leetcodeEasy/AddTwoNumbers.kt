package leetcodeEasy

import linkedList.ListNode



/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummy = ListNode(0)  // dummy head to simplify building result
        var p = l1
        var q = l2
        var current = dummy
        var carry = 0

        while (p != null || q != null || carry != 0) {
            val x = p?.`val` ?: 0
            val y = q?.`val` ?: 0

            val sum = x + y + carry     // add current digits + carry
            carry = sum / 10            // new carry
            current.next = ListNode(sum % 10)  // create node with ones digit

            current = current.next!!
            p = p?.next
            q = q?.next
        }

        return dummy.next   // skip the dummy
    }
}