import com.sun.jdi.Value
import kotlin.math.pow


fun main() {
    val List = listOf(3 ,2 ,5 ,1 ,9 ,6 ,7)
    println("The list: $List")
    val numberToSearchFor = getValidIntInputForList("Enter the number you want to search for:")
    println("The index of $numberToSearchFor is ${indexOf(List, numberToSearchFor)}")


    }









fun indexOf(list: List<Int>, numberToSearchFor: Int): Int {
    for (i in 0 until list.size -1) {
        if (list[i] == numberToSearchFor) {
            return i
        }
    }
    return -1
}



fun getValidIntInputForList(x: String): Int {
    while (true) {
        println(x)
        val input = readLine()?.toIntOrNull()

        if (input != null) {
            return input
        }
        else {
            println("Invalid input. Please enter a valid integer.")
        }
    }
}






