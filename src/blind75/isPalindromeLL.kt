package blind75



class isPalindromeLL {
}


private var current:ListNode? = null

fun isPalindrome(head:ListNode):Boolean{
    current = head
    return recursCheck(head)

}


fun recursCheck(head:ListNode?):Boolean{
    if (head==null){
        return true
    }

    if (!recursCheck(head.next)){
        return false
    }

    if (current?.`val`!=head.`val`){
        return false
    }
    current = current!!.next
    return true

}