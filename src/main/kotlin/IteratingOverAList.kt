fun main(){
    val fruits=listOf("Apple","Banana","Cherry")
    for(fruit in fruits){
        println("Fruit: $fruit")
    }
    for(index in fruits.indices){
        println(index)
    }
    for(index in fruits.indices){
        println("Fruit at index $index: ${fruits[index]}")
    }
}