


fun main(){
    var str = "hello"
    var numm = 1244
    var arr = arrayOf(5,2,1,4,6)
//    print(revString(str))
//    print(cd(numm))
   //// print(revNo(numm))
    for (i in 0..arr.size-1){
        print(arr[i])
    }

    for (i in arr.indices){
        println(i)
    }

}

/*fun revString(input:String):String{
    var revNo = ""
    for (i in input.length-1 downTo 0){
        revNo += input[i]
    }
    return revNo
}*/

/*fun revString(input:String):String{
    var revNo = ""
    for (i in input.length-1 downTo 0){
        revNo += input[i]
    }
    return revNo
}*/
//count digits
/*fun cd(n:Int):Int{
    var count = 0
    var num = n
    var revNo = 0
    while (num>0){
       count++
        num = num/10

    }
    return count
}*/

/*fun revNo(n:Int):Int{
    var count = 0
    var num = n
    var revNo = 0
    while (num>0){
        var ld = num%10
        count++
        num = num/10
        revNo = (revNo*10)+ld
    }
    return revNo
}*/



