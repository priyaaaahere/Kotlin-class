package Aug22_2024

fun main(){
    val numbers=arrayOf(1,2,3,4,5)
    val word:Array<String> =arrayOf("Kotlin","Java","Python")
    val squares=Array(5) {i->i*i}
//accessing elements
    val firstNum=numbers[0]
    val secondWord=word[1]

    println("$firstNum")
    println("$secondWord")

    //modifying elements
    numbers[0]=10
    word[1]="C"
    println("${numbers[0]}")
    println("${word[1]}")
    println("Numbers array using for loop")
    for(num in numbers){
        println(num)
    }
    for(w in word){
        println(w)
    }

}
