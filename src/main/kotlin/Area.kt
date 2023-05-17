import java.util.Scanner
fun main(){
    var multi=Scanner(System.`in`)
    println("Calculation of the Area of a rectangle")
    println("Formulae Is Length Multiplied By It's Width")

    println("Input Length:")
    var length= multi.nextFloat()
    println("Entered $length")

    println("Enter width:")
    var width= multi.nextFloat()
    println("Entered $width")

    println("Your Answer is......")
    var area=length*width
    println("Area $area")
}