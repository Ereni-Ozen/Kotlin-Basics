import com.sun.jdi.Value
import kotlin.math.pow


fun main() {
    //easy exercise
    val myArray = arrayOf(2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 )
    var sum = 0
    for(item in myArray) {
        sum += item
    }
    println(sum)

    //Hard exercis
    //println("Enter 5 numbers:")
    //var avg = 0.0
    //for(i in 1..5) {
    //    var input = readLine()?.toInt()
    //    if (input != null) {
    //        avg += input / 5.0
    //    }
    //}
    //println("The average value is $avg")
    //Philip yukarıdaki gibi yapmış, bende ekstra bir özellik daha ekleyerek aşağıdaki gib yaptım

    println("Enter how many numbers you would like to take the average of:")
    var howManyNumbers  = readLine()?.toIntOrNull()
    var avg = 0.0
    println("Please enter $howManyNumbers to take the average of")
    for(i in 1..howManyNumbers!!) {
        var userInput = readLine()?.toDouble()
        if (userInput != null) {
            avg += userInput / howManyNumbers.toDouble()
        }

    }
    println("average = $avg")


}
