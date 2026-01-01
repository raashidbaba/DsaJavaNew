package blind75


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun main(){

}




fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head

    while(fast?.next != null){
        slow = slow?.next
        fast = fast.next?.next
        if(slow==fast){
            return true
        }
    }
    return false
}