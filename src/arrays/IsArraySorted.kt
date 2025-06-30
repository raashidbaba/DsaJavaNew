package arrays




fun main(){
    val arr = arrayOf(1,2,3,3,45)
    print(isSorted(arr))
}






fun isSorted(arr:Array<Int>):Boolean{
    for (i in 1 until arr.size){
        if (arr[i]>=arr[i-1]){

        }else{
            return false
        }
    }
    return true


}