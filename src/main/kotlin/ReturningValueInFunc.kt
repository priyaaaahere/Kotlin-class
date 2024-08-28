fun main(ars:Array<String>){
   val a=10
   val b=20
   val result=sum1(a,b)
   println(result)
}
fun sum1(a:Int,b:Int):Int{
    val x=a+b
    println(x)
    return x
    println(x) //unreachable code
}