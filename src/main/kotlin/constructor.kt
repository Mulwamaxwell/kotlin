class Dog(var color:String,var breed:String, var sex:String,
          var age:Int){
    //Properties
}
fun main(){
    var d=Dog("White","German Shepherd","Female",6)
    println(d.color + "" + d.breed + "" + d.sex + "" + d.age)

    var puppy=Dog("Brown","Dober Man","Male",7)
    println(puppy.color + "" + puppy.breed + "" + puppy.sex + "" + puppy.age)
}