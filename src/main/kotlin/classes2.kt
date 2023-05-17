open class Figure(){
    var start:String="one"
    fun Area(){
        println("Area")
    }
    fun Perimeter(){
        println("Perimeter")
    }
    fun Draw(){
        println("Line")
    }
}
class Circle:Figure(){
    var radius:Int=660
    fun Area2(){
        println(3.412)
    }
    fun Perimeter2(){
        println("Perimeter")
    }
    fun Draw2(){
        println("Draw")
    }
}
class Rectangle:Figure(){
    var width:Int=660
    var height:Int=50
    fun area(){
        println(3.412)
    }
    fun perimeter(){
        println("Perimeter")
    }
    fun draw(){
        println("Draw")
    }
}
fun main(){
    var c=Circle()
    println(c.radius)
    c.Area2()
    var r=Rectangle()
    r.Area()
    println(r.height)
}