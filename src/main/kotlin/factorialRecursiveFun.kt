fun factorial(n:Int):Int{
    return if(n<=1) 1 else n*factorial(n-1)
}
fun main(){
    println("Enter number to find factorial:")
    var y:Int= readln().toInt()
    var x=factorial(y)
    println(x)
}