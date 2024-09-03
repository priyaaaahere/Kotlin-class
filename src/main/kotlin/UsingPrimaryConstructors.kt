class UsingPrimaryConstructors (var name: String, var age:Int){
    constructor(x:String):this(){
        this.name=x
        this.age=0

    }
    constructor():this("Priya",20)
    fun intro(){
        println("My name is $name and age is $age")
    }
}
fun main(){
    var a=UsingPrimaryConstructors("Anuka",21)
    a.intro()
    var b=UsingPrimaryConstructors()
    b.intro()
    var c=UsingPrimaryConstructors("Aeira")
    c.intro()
}