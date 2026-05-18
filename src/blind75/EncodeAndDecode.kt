package blind75



fun main(){
//        val strList = listOf("Hello","World")
//        val encodeRes = encode(strList)
//        print(encodeRes)
//
//         val decodeRes = decode(encodeRes)
//        println(decode(decodeRes))


    val strs = listOf("Hello", "World")

    val encoded = encode(strs)
    println(encoded)
    // Output: "5#Hello5#World"

    val decoded = decode(encoded)
    println(decoded)
    // Output: [Hello, World]


}


fun encode(strs:List<String>):String{

    val result = StringBuilder()
    for (str in strs){
        result.append(str.length).append('#').append(str)
    }
    return result.toString()
}



fun decode(encoded:String):List<String>{
    val result = mutableListOf<String>()
    var i = 0
    while (i < encoded.length){
        var j = i

        //first element we have added as length
        // and then we have added a #
        //so we are gonna add after these two
       while (j < encoded.length && encoded[j] != '#'){
            j++
       }

        //this will give us length which is int
        val length = encoded.substring(i, j).toInt()

        //this will add string from start to end in result list
        i = j + 1
        result.add(encoded.substring(i, i + length))


        //move i pointer for next string
        i += length

    }
    return result

}