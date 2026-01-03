package blind75

fun main(){}






    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()
        if (root == null) return result

        val queue: ArrayDeque<TreeNode> = ArrayDeque()
        queue.add(root)

        while(queue.isNotEmpty()){
            val currentList = mutableListOf<Int>()


            for(i in 0 until queue.size){
                val node = queue.removeFirst()
                currentList.add(node.`val`)

                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }

            }
            result.add(currentList)

        }
        return result

    }
