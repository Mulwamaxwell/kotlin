fun main(){
    //predefined function
    println("kotlin")
    var squareroot=Math.sqrt(5.0)
    println(squareroot)

    var round=Math.ceil(3.45)
    println(round)

    var round1=Math.round(3.45)
    myFun()
    myDetails("Max",19)

}
//user defined function
fun myFun(){
    println("Today is Friday")
    add()

}
fun add(){
    var num1=56
    var num2=12
    println(num1+num2)
}
fun myDetails(name:String,age:Int){
    println("$name is $age years old")

}