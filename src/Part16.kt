import com.sun.jdi.Value
import kotlin.math.pow


fun main() {
    //sumUpToN(n = 10)
//}
    //fun sumUpToN(n: Int) {
    //var result = 0
    //for (i in 1..n) {
    //    result += i
    //}
    //println("The sum of the values from 1 to $n is $result")
    //}
    //Philip yukarıdaki gibi yapmış ama ben birkaç fonksiyon daha ekleyerek yapmak istedim
    // diğer alıştırmalarda da bunu yaptığımı bazen yazıyorum bazende yazmayı unutuyorum
    //aslında daha ileri videolarda gösterdiği şeyleri (return gibi mesela) diğer dillerden bildiğim syntaxlar
    // ve "böyle birşey varmıdır acaba" diyerek yaptığım tahminler ile buldum, chatGPT'yi minimum düzeyde kavramları açıklaması
    // ve anlayamadığım konularda bilgi almak için kullandım.

    val rangeFirstValue = getValidInput("What is the first number for your range:")
    val rangeSecondValue = getValidInput("What is the second number for your range:")
    sumInRange(rangeFirstValue, rangeSecondValue)
}









fun sumInRange(rangeFirstValue: Int, rangeSecondValue: Int) {

        if (rangeFirstValue < rangeSecondValue) {
            forLoopAndPrint(rangeFirstValue, rangeSecondValue)
        }
         else if (rangeSecondValue < rangeFirstValue) {
            forLoopAndPrint(rangeSecondValue , rangeFirstValue )
        } else {
            println("The numbers you enter $rangeFirstValue and $rangeSecondValue are not suitable for this calculation, please try again later ")
        }
}

fun getValidInput(x: String): Int {
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

fun forLoopAndPrint(starting: Int, ending: Int) {
            var result = 0
            for (i in starting..ending) {
                result += i
            }
            println("Your the sum of your range is:$result")
}



