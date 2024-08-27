fun main(){
    val age=15
    if(age<13){
        println("Child")
    }
    else if(age in 13..19){
        println("Teenager")
    }
    else{
        println("Adult")
    }
}