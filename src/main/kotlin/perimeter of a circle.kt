import java.util.Scanner
fun main(){
    println("Perimeter of a circle")
    var per=Scanner(System.`in`)

    println("Enter your diameter:")
    var diameter=per.nextFloat()
    println("Entered $diameter")

    println("Your Answer is......")

    var pi= 22/7
    var perimeter=pi*diameter
    println("println $perimeter calculated Successfully ")
}