open class Living(){
    var age:Int=2
    var gender:String="cat"

    fun isMammal(){
        println("Mammal")
    }
}
class Duck:Living(){
    var color="red"

    fun swim(){
        println("Backstroke")
    }
}
class Fish:Living(){
    var canEat:Boolean=true
    fun swim(){
        println("swimming")
    }
}
class Horse:Living(){
    var isWild:Boolean=false
    fun run(){
        println("Running")
    }
}
fun main(){
    var d=Duck()
    println(d.gender)
    println(d.color)
    var h=Horse()
    h.isMammal()
    var f=Fish()
    println(f.age)


}