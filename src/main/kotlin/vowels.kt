import java.util.Scanner
fun main(){
    var letter=Scanner(System.`in`)
    println("""
        Enter your Letter:
    """.trimIndent())

    var read= readln()

    if (read =="a" || read== "e" || read=="i" || read=="o" || read=="u"||read =="A" || read== "E" || read=="I" || read=="O" || read=="U" ){
        println("Letter is a vowel")
    }
    else{
        println("letter is a consonant")
    }
}