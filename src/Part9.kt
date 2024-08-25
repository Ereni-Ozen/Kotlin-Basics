import com.sun.jdi.Value
import kotlin.math.pow


fun main() {
val checkedString1 = "android_devs"
val checkedString2 = "racecar"

    if(checkedString1 == checkedString1.reversed()){
        println("$checkedString1 is a palindrome")
    }else {
        println("$checkedString1 is not a palindrome")
    }

    if(checkedString2 == checkedString2.reversed()) {
        println("$checkedString2 is a palindrome")
    } else {
        println("$checkedString2 is not a palindrome")
    }
}