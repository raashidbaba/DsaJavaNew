/*
class practice3 {
}*/




open class Animal(){
   open fun sound(){
        println("bark")
    }
}


class Cat:Animal(){
//    override fun sound() {
////        super.sound()
//        print("meow")
//    }
fun catSound(){
    print("meow")
}
}


fun main(){
    val clas = Cat()
    clas.sound()
    clas.catSound()
}