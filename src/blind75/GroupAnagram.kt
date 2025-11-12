package blind75

// Example usage
fun main() {
    val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val result = groupAnagrams(input)
    println(result)
}


fun groupAnagrams(strs: Array<String>): List<List<String>> {
    // Map from signature (sorted chars) → group of strings
    val map = mutableMapOf<String, MutableList<String>>()

    for (s in strs) {
        // Compute signature by sorting characters of s
        val signature = s.toCharArray()
            .sorted()
            .joinToString(separator = "")

        // If key not present, create new list
        if (!map.containsKey(signature)) {
            map[signature] = mutableListOf()
        }
        // Add the original string to the corresponding group
        map[signature]!!.add(s)
    }

    // Return all the grouped lists
    return map.values.toList()
}
