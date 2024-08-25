import com.sun.jdi.Value
import kotlin.math.pow


fun main() {
    val summ = alternatingSum(3, 4, 5, 2, 1, 2, 3)
    print("The alternating sum is: $summ")
}


fun alternatingSum(vararg numbers: Int): Int {
    var sum = 0
    var swich = true
    for (number in numbers) {
        if (swich) {
            sum += number
        } else {
            sum -= number
        }
        swich = !swich
    }
    return sum
}
