package Practice


fun main(){
    //inheritance example
    val dog = Dog()
    dog.eat()
    dog.bark()

    //override example
    val cat = Cat()
    cat.sound()
}

//Inheritance
open class Animal {
    fun eat(){
        println("eating")
    }
}

class Dog : Animal(){
    fun bark(){
        println("barking")
    }
}


//override a fun
open class Animal2{
    open fun sound(){
        println("a basic sound")
    }
}

class Cat : Animal2(){
    override fun sound() {
        super.sound()
        println("meow")
    }
}