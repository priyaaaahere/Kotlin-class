fun main(){
    var a=10
    var b=23
    val add=a+b
    println("Addition : $a + $b = $add")
    println("Multiplication: $a * $b = ${a*b}")
    println("Division: $b / $a = ${b/a}")
    println("Subtraction: $b - $a = ${b-a}")
    println("Mod: $b % $a: ${b%a}")
    val isTrue = true
    val isFalse = false
    val result1 = isTrue && isFalse
    val notresult = !result1
    println(result1)
    println(notresult)
    println("isTrue || isFalse: ${isTrue || isFalse}")
    println("isTrue || isTrue: ${isTrue || isTrue}")

//relational:
    println("Greater than : $a > $b = ${a>b}")
    println("Smaller than: $a < $b = ${a<b}")
    println("Greater than equal: $b >= $a = ${b>=a}")
    println("smaller than equal: $b <= $a = ${b<=a}")
    println("is equal: $b == $a: ${b==a}")
    println("not equal: $b != $a: ${b!=a}")

//Assignment:
    a+=b
    println(a) //10+23
    a-=b
    println(a)//33-23
    a*=b
    println(a)//10*23
    a/=b
    println(a)//a=230/23=10
    b%=a
    println(b)//b=23%10

//unary op
    println("+$a: ${+a}")
    println("-$a: ${-a}")
    println("++$a: ${++a}")
    println("--$a: ${--a}")
    println("!$isTrue: ${!isTrue}")
}