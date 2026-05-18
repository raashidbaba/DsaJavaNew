package linkedList


fun main() {
    val head  = buildList(intArrayOf(1, 2, 3, 4, 5))


    val result = head?.let { removeNode(it, 2) }

    printList(result)
}

fun printList(head: ListNode?) {
    var curr = head
    while (curr != null) {
        print("${curr.value} -> ")
        curr = curr.next
    }
    println("null")
}


fun buildList(arr: IntArray): ListNode? {
    val dummy = ListNode(0)
    var curr = dummy

    for (num in arr) {
        curr.next = ListNode(num)
        curr = curr.next!!
    }

    return dummy.next
}


fun removeNode(head:ListNode,  n:Int):ListNode?{

    val dummy  = ListNode(0)
    dummy.next = head

    var left : ListNode ? = dummy
    var right : ListNode ? = head

    var count = n
    while (count>0){
        right = right?.next
        count--
    }

    while (right!= null){
        left = left?.next
        right = right.next
    }


    left?.next = left?.next?.next

    return dummy.next





}