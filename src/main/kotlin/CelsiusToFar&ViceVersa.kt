fun celToFar(c: Int?):Unit{
    if(c!=null){
        val f=((c*9)/5)+32
        println("$c C is equal to $f F")
    }
    else{
        println("Input for Celsius is null.")
    }
}
fun farToCel(f: Int?):Unit{
    if(f!=null){
        val c=((f-32)*5)/9
        println("$f F is equal to $c C")
    } else {
        println("Input for Fahrenheit is null.")
    }
}

fun main() {
    celToFar(32) //Celsius to Fahrenheit
    farToCel(89) //Fahrenheit to Celsius
    //null inputs
    celToFar(null)
    farToCel(null)
}
