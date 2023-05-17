import java.util.Scanner
fun main(){
    println("Area of a trapezium")

    var div=2

    var area=Scanner(System.`in`)

    println("Enter your first length 'a':")
    var length1=area.nextFloat()
    println("Entered $length1")

    println("Enter your second length 'b':")
    var length2=area.nextFloat()
    println("Entered $length2")

    println("Enter your Height:")
    var height=area.nextFloat()
    println("Entered $height")

    println("Your Answer is.....")
    var trapezium=((length1+length2)/2)*height
    println("Area $trapezium calculated successfully")
}