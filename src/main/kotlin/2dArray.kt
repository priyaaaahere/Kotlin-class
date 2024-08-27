fun main(){
    //2d array
    val twodarr=arrayOf(arrayOf(1,2,3,4,5),arrayOf(7,8,9,2,1))
    for(arr in twodarr){
        for(num in arr){
            print(num)
            print(" ")
        }
        println()

    }
    println()
    //2d array
    val matrix: Array<Array<Int>> =arrayOf(arrayOf(1,2,3),arrayOf(4,5,6))
    println("${matrix[0][1]}")
}