package blind75

fun main(){

}


// Serialize: Tree -> String
fun serialize(root: TreeNode?): String {

    fun dfs(node: TreeNode?, list: MutableList<String>) {
        if (node == null) {
            list.add("null")
            return
        }

        list.add(node.`val`.toString())
        dfs(node.left, list)
        dfs(node.right, list)
    }

    val result = mutableListOf<String>()
    dfs(root, result)
    return result.joinToString(",")
}

// Deserialize: String -> Tree
fun deserialize(data: String): TreeNode? {
    val values = ArrayDeque(data.split(","))

    fun dfs(): TreeNode? {
        val value = values.removeFirst()

        if (value == "null") return null

        val node = TreeNode(value.toInt())
        node.left = dfs()
        node.right = dfs()
        return node
    }

    return dfs()
}

