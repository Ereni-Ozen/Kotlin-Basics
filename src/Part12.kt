import com.sun.jdi.Value
import kotlin.math.pow


fun main() {
    //Easy exercise
    println("please enter a number")
    var i = readLine()?.toInt()
    println("Lets count from $i to 0")
    while (i != null && i >= 0) {
        println(i)
        i--

    }
    //Hard exercise
    println("Please enter the number1:")
    var x = readln()?.toInt()
    println("please enter the number2:")
    var y = readln()?.toInt()
    var result = 1
    var count = 0
    while (y != null && x != null && y > count) {
    result *= x
        count++
    }
    println("$x to the power of $y is $result")
}
