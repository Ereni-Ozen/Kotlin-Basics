import com.sun.jdi.Value
import kotlin.math.pow


fun main() {
    //Easy exer
    println("Please enter how many numbers you would like to list:")
    val howMany = readLine()?.toInt()
    val list = mutableListOf<Int>()
    for (i in 1..howMany!!){
        val input = readLine()?.toInt()
        if (input != null){
            list.add(input)
        }
    }
    println(list.reversed())
    //Hard exer
    println("Enter how many Fibonacci numbers you would like to see from the start, n > 1:")
    val list2 = mutableListOf(0, 1)
    val n = readLine()?.toInt()

    if (n != null){
        for (i in 2..n-1) {
            list2.add(list2[i-2] + list2[i-1])
        }

    }
    println(list2)
}
