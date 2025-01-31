class Practice {

    /*companion object {

        const val MIN = 10

    }*/

}


fun main(){
//    println(Practice.MIN)
   /* val human = Person("bob",12).apply {
        name = " jum"
        height = 20
    }*/

//    println(human.name)
//    println(human.height)
/*
    val name : String = "me"
    name.let {
        println("hello $it")
    }*/

    /*val list = mutableListOf(1,2,3).also {
        print("org $it")
    }
    list.add(5)*/
val text = "hello"
    println(text.addExclamation())

}


var  hello  :Int = 20

fun String.addExclamation(): String{
    return this + "!"
}



class Person(var name:String, var height:Int){}
