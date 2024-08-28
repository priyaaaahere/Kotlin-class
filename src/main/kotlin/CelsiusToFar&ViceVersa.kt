fun celtofar(a:Int){
    val f=((a*9)/5)+32
    println(f)
}
fun farTocel(b:Int){
    val c=((b-32)*5)/9
    println(c)
}
fun main(){
    celtofar(32)
    farTocel(89)
}