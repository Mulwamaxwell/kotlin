class Car{
    var make:String="Corona"
    var model:Int=5432
    var color:String="Blue"
    var driving_speed:Int=200

}
fun drive(){
    println("Mileage")
}
fun turn(){
    println("Turning")
}
fun stop(){
    println("Break")
}
fun main(){
    var drive=Car()
    println(drive.make + " " + drive.model + " " + drive.color + " " + drive.driving_speed)
}