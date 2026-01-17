package blind75

import str

// Example usage
fun main() {
    val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val result = groupAnagrams(input)
    println(result)
}

//this solution involves sorting
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


//using hashmap
fun groupAnagram(strs: Array<String>):List<List<String>>{

    val map = HashMap<String, MutableList<String>>()

    for (word in strs) {

        val count = IntArray(26)

        for (ch in word) {
            count[ch - 'a']++
        }

        val key = count.joinToString("#")

        if (!map.containsKey(key)) {
            map[key] = mutableListOf()
        }

        map[key]!!.add(word)
    }

    return map.values.toList()
}






