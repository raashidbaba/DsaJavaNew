package blind75

fun main() {

    val s = "([])"

    println(validParenthesis(s))  // prints: true
}



fun validParenthesis(str: String): Boolean {
    val stack = ArrayDeque<Char>()

    for (ch in str) {
        if (ch == '(' || ch == '{' || ch == '[') {
            stack.addLast(ch)   // push
        } else {
            if (stack.isEmpty()) return false

            val top = stack.removeLast() // pop

            if (
                (ch == ')' && top != '(') ||
                (ch == '}' && top != '{') ||
                (ch == ']' && top != '[')
            ) {
                return false
            }
        }
    }

    return stack.isEmpty()
}