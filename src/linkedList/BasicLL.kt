package linkedList

fun main() {
    pushFront(10)
    pushFront(20)
    pushFront(30)

    var curr = head
    while (curr != null) {
        print("${curr.`val`} -> ")
        curr = curr.next
    }
    println("null")
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

var head: ListNode? = null

fun pushFront(value: Int) {
    val newNode = ListNode(value)
    newNode.next = head
    head = newNode
}
