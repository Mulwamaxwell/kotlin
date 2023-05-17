import java.util.Scanner

fun main() {
    var temp = Scanner(System.`in`)

    println("Enter Temperature:")
    var temperature=temp.nextInt()
    if (temperature<37) {
        println("Too cold")
    }
    else if (temperature>37){
        println("Too hot")
    }
    else{
        println("Normal Temperature")
    }

}