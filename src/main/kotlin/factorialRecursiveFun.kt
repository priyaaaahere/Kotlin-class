fun factorial(n:Int):Int{
    if(n<=1) {
        return 1
    }
    else {
        return n * factorial(n - 1)
    }
}
fun main(){
    println("Enter number to find factorial: ")
    var y:Int= readln().toInt()
    var x=factorial(y)
    println(x)
}