package Sep3_2024

interface Shape{
    fun area():Double
}
open class Rectangle(val a:Double, val b:Double):Shape{
    override fun area():Double{
        return a * b
    }
    open fun display(){
        println("Area of Rectangle: ${area()}")
    }
}
class Square(side:Double):Rectangle(side,side){
    override fun display(){
        println("Area of square: ${area()}")
    }
}
fun main(){
    val myRectangle=Rectangle(4.0,5.0)
    myRectangle.display()
    val mySquare=Square(3.0)
    mySquare.display()
}
