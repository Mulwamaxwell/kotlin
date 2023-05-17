import  java.util.Scanner
fun main(){
    var cuboid=Scanner(System.`in`)
    println("Volume of a Cuboid")
    println("The formulae is length multiplied by width multiplied by it's height")

    println("Enter your length:")
    var length=cuboid.nextFloat()
    println("Entered $length")

    println("Enter your width:")
    var width=cuboid.nextFloat()
    println("Entered $width")

    println("Enter your height:")
    var height=cuboid.nextFloat()
    println("Entered $height")

    println("Your Answer is.......")
    var perimeter=length*width*height
    println("Perimeter $perimeter Calculated successfully")

}