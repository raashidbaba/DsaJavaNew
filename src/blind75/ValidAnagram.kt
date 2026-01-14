package blind75

fun main() {


    val s = "anagram"
    val t = "nacaram"

    val result = validAnagram(s, t)
    println("Are '$s' and '$t' anagrams? $result")
}


fun validAnagram(s:String,r:String):Boolean{

    if (s.length != r.length){
        return false
    }

    val hashMap1 = mutableMapOf<Char,Int>()
    val hashMap12 = mutableMapOf<Char,Int>()



    for (i in s.indices) {
        //we look up in map,if value exists we return 0 or else add 1 to count
        hashMap1[s[i]] = hashMap1.getOrDefault(s[i], 0) + 1
        hashMap12[r[i]] = hashMap12.getOrDefault(r[i], 0) + 1
    }

    println(hashMap1)
    println(hashMap12)

//order does not matter here
return hashMap1==hashMap12
}