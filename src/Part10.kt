import com.sun.jdi.Value
import kotlin.math.pow


fun main() {

    val userInputAge = readLine()?.toInt()

    if(userInputAge != null ) {
        if(userInputAge >= 0 && userInputAge < 18){
            println("You are just $userInputAge, you are a child.")
        } else if ( userInputAge <= 65 && userInputAge >= 18){
            println("You are an adult at the age of $userInputAge,respect")
        }else {
            println("You are really old.")
            }
        }

    }