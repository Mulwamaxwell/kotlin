import java.util.Scanner
fun main(){
    println("Input 3 numbers")
    var numbers = Scanner(System.`in`)

    println("Enter your first number:")
    var num1= numbers.nextFloat()
    println("Entered $num1")

    println("Enter your second number:")
    var num2 = numbers.nextFloat()
    println("Entered $num2")

    println("Enter your third number:")
    var num3 = numbers.nextFloat()
    println("Entered $num3")

    if (num3>num1 && num1<num2){
        println("$num3 is the largest")
        println("$num1 is the smallest")
    }
    else{
        println("false")
    }
}