import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)


    println("Enter number:")
    var num1=read.nextFloat()

    if (num1 >0){
        println("Number is positive")
    }
    else if (num1 <0){
        println("Number is negative")
    }
    else {
        println("zero is neutral")    }

}