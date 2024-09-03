package Aug27_2024

fun main(){
    val a=23
    val b=45
    val op="add"
    if(op=="add"){
        println("${a+b}")
    }
    else if(op=="minus"){
        println("${b-a}")
    }
    else if(op=="multiply"){
        println("${a*b}")
    }
    else if(op=="div"){
        if(b!=0){
            println("${b/a}")
        }
        else{
            println("Exception")
        }
    }
    else if(op=="mod"){
        println("${b%a}")
    }
    else{
        println("Invalid")
    }
}
