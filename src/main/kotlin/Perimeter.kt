import java.util.Scanner
fun main(){
    println("The perimeter of a rectangle")
    println("Formulae is 2(l+w)")

    var sum=Scanner(System.`in`)

    println("Enter your length:")
    var length=sum.nextFloat()
    println("Entered $length")

    println("Enter your Width:")
    var width=sum.nextFloat()
    println("Entered $width")

    println("Your Answer is.....")

    var perimeter=2*(length+width)
    println("Perimeter $perimeter Calculated successfully")

}