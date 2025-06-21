package Practice


fun main(){
    val person = Person("Alice",2,2)
    println("Name: ${person.name}, Age: ${person.age}")
}


// secondary constructor
class Person {
    var name : String = ""
    var age :Int = 0
    var id : Int = -1

    constructor(name:String){
        this.name = name
    }

    constructor(name: String,age:Int){
        this.name = name
        this.age = age
    }

    constructor(name: String,age:Int,id:Int){
        this.name = name
        this.age = 33
    }
}