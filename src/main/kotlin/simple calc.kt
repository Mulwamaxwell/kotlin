import java.util.Scanner
fun main(){
    println("Enter your operation;")
    println("1:Addition")
    println("2:Subtraction")
    println("3:Division")
    println("4:Multiplication")
    println("Choice:")
    var calc=Scanner(System.`in`)
    var choice=calc.nextInt()

    println("Enter your first number:")
    var num1=calc.nextInt()
    println("Entered $num1")

    println("Enter your second number:")
    var num2=calc.nextInt()
    println("Entered $num2")
    if (choice==1){
        println("The sum of $num1 + $num2 is.....")
        println(num1+num2)
    }
    else if(choice==2){
        println("The subtraction of $num1-$num2 is...")
        println(num1-num2)
    }
    else if(choice==3) {
        println("The Division of $num1/$num2 is...")
        println(num1 / num2)
    }
    else if(choice==4) {
        println("The Multiplication of $num1*$num2 is...")
        println(num1 * num2)
    }
    else{
        println("Invalid operation")
    }
}