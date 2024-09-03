class Constructors{
    var name: String
    var age: Int
    constructor(x: String, y:Int){
        this.name=x
        this.age=y
    }
    constructor(x:String){
        this.name=x
        this.age=0
    }
    constructor(){
        this.name="Priya"
        this.age=0
    }
    fun intro(){
        println("My name is $name and age is $age")
    }
}
fun main(){
    var a=Constructors("Riya",22)
    a.intro()
    var b=Constructors()
    b.intro()
    var c=Constructors("Heena")
    c.intro()
}