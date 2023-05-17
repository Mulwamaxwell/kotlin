open class Shape1{
    open fun area(){
        println("Area")
    }
}
class Circle1:Shape1(){
    override fun area(){
        println("Circle")
    }
}
class Triangle:Shape1(){
    override fun area(){
        println("Triangle")
    }
}
class Rectangle1:Shape1(){
    override fun area(){
        println("rectangle")
    }
}
fun main(){
    var f=Rectangle1()
    f.area()
    var t=Triangle()
    t.area()
}