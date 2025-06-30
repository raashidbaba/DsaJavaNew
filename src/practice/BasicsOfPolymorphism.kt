package practice


fun main(){

}






//method overloading
class Cal {
    fun add(a:Int,b:Int):Int{
        return a+b
    }

    fun add(a:Int,b:Int,c:Int):Int{
        return a+b+c
    }

    fun add(a:Double,b:Double):Double{
        return a+b
    }
}



//method overriding
open class Animalsound{
    open fun sound(){
        println("animals make sound")
    }
}

class Dog1:Animalsound(){
    override fun sound() {
        super.sound()
        println("bark")
    }
}

class Cat2:Animalsound(){
    override fun sound() {
        super.sound()
        println("meow")
    }
}