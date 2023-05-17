import java.util.Scanner
fun main(){
    var read = Scanner(System.`in`)

    println("Enter your first number:")
    var num1=read.nextFloat()

    println("Enter your second number:")
    var num2=read.nextFloat()

    println("Enter your operator:")
    println("1:Addition")
    println("2:Subtraction")
    println("3:Multiplication")
    println("4:Division")
    var operator = readln()

    var result = when (operator){
        "1"->num1+num2
        "2"->num1-num2
        "3"->num1*num2
        "4"->num1/num2
        else -> "invalid operator"
    }
    println("Answer = $result")
}