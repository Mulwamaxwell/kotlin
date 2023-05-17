class People(var name:String,var age:Int,var jobstatus:String,var gender:String){

}
fun main(){
    var person1=People("Rita",18,"unemployed","Female")
    println(person1.name + " " + person1.age + " " + person1.jobstatus + " " + person1.gender )

    var person2=People("David",43,"unemployed","Male")
    println(person2.name + " " + person2.age + " " + person2.jobstatus + " " + person2.gender)
}
