import com.sun.jdi.Value
import kotlin.math.pow


fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    println("product of $list is ${list.multiplicationOfAllNumbers()}")
}


fun List<Int>.multiplicationOfAllNumbers(): Int {
    var result = 1
    for (value in this) {
        result *= value
    }
    return result
}

