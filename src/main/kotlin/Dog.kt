class Animal(var breed:String,var size:String,var age:Int,var Color:String){
    fun eat(food:String){

    }
    fun sleep(bed:String){

    }
    fun sit(chair:String){

    }
    fun run(run:Int){

    }
}
fun main(){
    var puppy1=Animal("Nespolitan Mastiff","Large",5,"Black")
    println(puppy1.eat("Pizza"))

    var puppy2=Animal("Malian","Small",2,"White")
    puppy2.sleep("8 hours")

    var puppy3=Animal("Chow Chow","Medium",5,"Black")
    puppy3.sit("Upright")
    puppy3.run(34)

    println(puppy1.breed + " " + puppy1.size + " " + puppy1.age + " " + puppy1.Color)
    println(puppy2.breed + " " + puppy2.size + " " + puppy2.age + "" + puppy2.Color)
    println(puppy3.breed + " " + puppy3.size + " " + puppy3.age + " " + puppy3.Color)



}