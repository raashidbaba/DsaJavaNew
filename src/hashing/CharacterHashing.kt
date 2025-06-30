package hashing


fun main() {
        val str = "abcdabefc"
        val query = arrayOf('a','b','c','h','g')

        val hash = IntArray(25)

    //pre-computation
    for (i in str){

        print( hash[i - 'a']++)


    }


    // queries
    for (q in query) {
        val count = hash[q - 'a']
        println("Character '$q' occurs $count times")
    }


}