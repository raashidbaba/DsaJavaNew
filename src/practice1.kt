

fun main(){
val arr = arrayOf(1,2,3,3,4,5,2,1)
//    dupArray(arr)
//   dupArray(arr)
    freqInArray(arr)


}




fun anagram(str1:String,str2:String):Boolean{
    if (str1.length != str2.length){
        return false
    }

    val map1 = HashMap<Char,Int>()
    val map2 = HashMap<Char,Int>()

    for (char in str1){
        map1[char] = map1.getOrDefault(char,0)+1
    }

    for (char in str2){
        map2[char] = map2.getOrDefault(char,0)+1
    }

    return map1==map2



}


//Q.first non-repeating character in a string
fun nonRpr(str:String):Char{
    val char = 'c'
    val map = HashMap<Char,Int>()

    for (ch in str){
        map[ch] = map.getOrDefault(ch,0) + 1
    }


    for (ch in str){

        if (map[ch]==1){
            return ch
        }

    }


    return char
}



fun dupArray(arr:Array<Int>) {

    val map = HashMap<Int, Int>()

    for (items in arr) {
        map[items] = map.getOrDefault(items, 0) + 1

    }

    for ( (key,value )in map){

        if (value>1){
            print(key)
        }

    }



}



fun freqInArray(arr: Array<Int>){
    val map = HashMap<Int,Int>()

    for (items in arr){
        map[items] = map.getOrDefault(items,0) + 1

    }

     for ((key,value ) in map){
         print("${key}, -> ${value},")

     }




}


fun highestFreqInArray(arr:Array<Int>){
    val map1 = HashMap<Int,Int>()

    for (items in arr){
        map1[items] = map1.getOrDefault(items,0) + 1
    }




    fun reverseArray(arr: Array<Int>){

    }



//
//    fun swap(str:String,first:Int,last:Int){
//        val temp = str[first]
//        str[first] = str[last]
//        str[last] = temp
//    }




}



















