import java.util.Scanner
fun main(){
    println("Simple calc code using user-defined functions ")
    var calc=Scanner(System.`in`)
    println("enter your second")
    sum(2,3)
    subtract(3,10)
    division(55,66)
    multiply(100,10)
}
fun subtract(num1:Int,num2:Int){
    println(num1-num2)
}
fun multiply(num1: Int,num2: Int){
    println(num1-num2)
}
fun division(num1: Int,num2: Int){
    println(num1/num2)
}
fun sum(num1: Int,num2: Int){
    println(num1+num2)
}