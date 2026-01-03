package blind75



// Definition for a binary tree node.
 class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
         var right: TreeNode? = null
     }


fun main(){

}




//iterative approach
fun lca(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode? {
    var curr = root

    while(curr!=null){
        if (p.`val`>curr.`val` && q.`val`>curr.`val`){
            curr = curr.right!!
        }else if (p.`val`< curr.`val` && q.`val`<curr.`val`){
            curr = curr.left!!
        }else{
            return curr

        }
    }
    return null

}



//recursive approach
fun lcaRec(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode? {
    if (root == null) return null

    // If both are less than root -> go left
    if (p.`val` < root.`val` && q.`val` < root.`val`) {
        return lcaRec(root.left!!, p, q)
    }

    // If both are greater than root -> go right
    if (p.`val` > root.`val` && q.`val` > root.`val`) {
        return lcaRec(root.right!!, p, q)
    }

    // Otherwise, root is the LCA
    return root
}