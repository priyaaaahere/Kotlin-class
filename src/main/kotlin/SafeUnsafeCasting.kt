fun main(){
    val a="hi"
    val b:String=a as String
    println("Unsafe case result: $b")
    //val c:Int =a as Int
    //println("ClassCast Exception")
    val c:Int? = a as? Int
    println("Safe Cast: $c")
}