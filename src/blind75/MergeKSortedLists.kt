package blind75

fun main(){}



fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    if (lists.isEmpty()) return null

    var interval = 1
    var arr = lists

    while (interval < arr.size) {
        var i = 0
        while (i + interval < arr.size) {
            arr[i] = mergeTwoLists(arr[i], arr[i + interval])
            i += interval * 2
        }
        interval *= 2
    }

    return arr[0]
}



fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val dummy = ListNode(0)
    var current = dummy
    var p1 = list1
    var p2 = list2

    while (p1 != null && p2 != null) {
        if (p1.`val` <= p2.`val`) {
            current.next = p1
            p1 = p1.next
        } else {
            current.next = p2
            p2 = p2.next
        }
        current = current.next!!
    }


    current.next = if (p1 != null){
        p1
    }else{
        p2
    }

    return dummy.next



}