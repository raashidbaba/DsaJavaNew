package trees


class TreeNode(var value:Int){
    var left = null
    var right = null
}




fun main(){

}



private var index = -1
fun buildBinaryTree(preOrder:IntArray):TreeNode?{
        // Base condition
        if (index>=preOrder.size)return null

        val value = preOrder[index]

        // Create current node
        val node = TreeNode(value = value)

    // Build left subtree
    node.left = buildBinaryTree(preOrder)

    // Build right subtree
    node.right = buildBinaryTree(preOrder)

    return node
}


