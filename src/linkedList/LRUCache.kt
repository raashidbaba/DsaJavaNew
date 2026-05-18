package linkedList


fun main() {
    val lru = LRUCache(2)

    lru.put(1, 1)
    lru.put(2, 2)
    println(lru.get(1))   // 1

    lru.put(3, 2)         // evicts key 2
    println(lru.get(2))   // -1

    lru.put(4, 4)         // evicts key 1
    println(lru.get(1))   // -1
    println(lru.get(3))   // 2
    println(lru.get(4))   // 4
}

class LRUCache(private val capacity: Int) {

    private class Node(
        var key: Int,
        var value: Int,
        var prev: Node? = null,
        var next: Node? = null
    )

    private val map = HashMap<Int, Node>()

    // Dummy head & tail
    //these act as boundaries in DLL
    // head ->real nodes->dummy
    private val head = Node(0, 0)
    private val tail = Node(0, 0)


    //initialising DLL,using dummy nodes
    //head -empty body-tail
    init {
        head.next = tail
        tail.prev = head
    }

    //This function is used to retrieve a value from the cache AND update its usage.

//    It does 2 things:
//    Fetch the value
//    Mark it as recently used
    fun get(key: Int): Int {
        val node = map[key] ?: return -1

        remove(node)
        insert(node)

        return node.value
    }

//    insert new key-value
//    Update existing key
//    Remove LRU if capacity is exceeded

    fun put(key: Int, value: Int) {
        //old node is already in the list
        //We remove it
        // so we can re-insert updated version at front
        if (map.containsKey(key)) {
            val existing = map[key]!!
            remove(existing)
        }

//        Creates new node with updated value
//        Adds it to HashMap
//        Inserts at front (MRU position)
        val node = Node(key, value)
        map[key] = node
        insert(node)


//        If cache is full:
//        tail.prev = Least Recently Used (LRU)
//        Remove it from:
//        Linked List
//         HashMap
        if (map.size > capacity) {
            val lru = tail.prev!!
            remove(lru)
            map.remove(lru.key)
        }
    }

    //removes node from its current pos in the list
    private fun remove(node: Node) {
        val prev = node.prev
        val next = node.next
        prev?.next = next
        next?.prev = prev
    }


    //inserts node right after the head
    //MRU
    private fun insert(node: Node) {
        //save first node,one after head
        val next = head.next

        //head ⇄ node ⇄ A ⇄ B ⇄ tail

        head.next = node
        node.prev = head

        node.next = next
        next?.prev = node
    }
}