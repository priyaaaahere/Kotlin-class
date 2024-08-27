fun main(){
    val dayOfWeek=5
    val dayName=when(dayOfWeek){
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thurs"
        5->"Fri"
        6->"Sat"
        7->"Sunday"
        else->"Invalid Day"
    }
    println("Day of the week: $dayName")
}