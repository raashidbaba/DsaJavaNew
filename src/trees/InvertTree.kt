package trees

import java.util.*

class Node(var value: Int) {
    var left: Node? = null
    var right: Node? = null
}


fun main() {
    val arr = arrayOf(1,2,3,4,5,6,7)

    val root = buildTree(arr)

    printLevelOrder(root)
}




fun printLevelOrder(root: Node?) {
    if (root == null) return

    val queue: Queue<Node> = LinkedList()
    queue.add(root)

    while (queue.isNotEmpty()) {
        val node = queue.poll()
        print("${node.value} ")

        node.left?.let { queue.add(it) }
        node.right?.let { queue.add(it) }
    }
}



//build tree dynamically
fun buildTree(arr: Array<Int>): Node? {
    if (arr.isEmpty()) return null

    val root = Node(arr[0])
    val queue: Queue<Node> = LinkedList()
    queue.add(root)

    var i = 1

    while (i < arr.size) {
        val current = queue.poll()

        // Left child
        if (i < arr.size) {
            current.left = Node(arr[i])
            queue.add(current.left)
            i++
        }

        // Right child
        if (i < arr.size) {
            current.right = Node(arr[i])
            queue.add(current.right)
            i++
        }
    }

    return root
}


fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) return null

    val temp = root.left
    root.left = root.right
    root.right = temp

    invertTree(root.left)
    invertTree(root.right)

    return root
}





