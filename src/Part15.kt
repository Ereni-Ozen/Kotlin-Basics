import com.sun.jdi.Value
import kotlin.math.pow


fun main() {

    println("What is your name?")
    val name = readLine().toString()
    println("Where are you from?")
    val country = readLine().toString()

    when(country.toUpperCase()) {
        "USA" -> println("Hello, $name")
        "INDIA" -> println("Namaste, $name")
        "GERMANY" -> println("Hallo, $name")
        "RUSSIA" -> println("Privet, $name")
        "TURKEY" -> println("Merhaba, $name")
        else -> println("I dont know $country's language but hi anyways $name")
    }

}
