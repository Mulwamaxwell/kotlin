fun main(){
    for (number in 10 .. 15){
        println(number)
    }
    for (letter in 'c'.. 'f'){
        println("letter is $letter")
    }
    for (num in 1 .. 10){
        if (num==6){
            break
        }
        println(num)
    }
    for (cons in 'a'..'d'){
        if (cons=='c'){
            continue
        }
        println(cons)
    }

}