open class Shape{
    open fun draw(){
        println("Drawing")
    }
}

class Rectangle2:Shape(){
     override fun draw(){
        println("Drawing a rectangle")
    }
}
class Square:Shape(){
    override fun draw(){
        println("Drawing square")
    }
}
fun main(){
    var r= Rectangle2()
    r.draw()
    var s=Square()
    s.draw()
    var v= Shape()
    v.draw()
}