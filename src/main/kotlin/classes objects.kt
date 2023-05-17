class Person{
    var name:String="Max"
    var age:Int=20
    var location:String="Nairobi"
    var yearOfBirth:Int=2004

    //Methods/functions

    fun eat(){
        println("Eating")
    }
    fun sleep(){
        println("Sleeping")
    }
}
fun main(){
    var teacher=Person()
    println(teacher.location)

    teacher.eat()
}