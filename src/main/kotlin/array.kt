fun main(){
    var languages= arrayOf("Python","Kotlin","Java")
    println(languages [0])//Accessing an element

    languages[0]="Javascript"//Changing an element
    println(languages[0])

    var language=languages.plus("C")//Adding an element
    for (lang in language){
        println(lang)
    }
    println(languages.size)

    for (c in languages){
        println(c)
    }
}