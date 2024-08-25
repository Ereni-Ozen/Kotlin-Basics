import com.sun.jdi.Value
import kotlin.math.pow


fun main() {
    val pi = 3.14159265
    val radius = 5.5
    val volumeOfSphere = (4.0 / 3.0) * pi * radius.pow(3.0)
    //ben bu şekilde yaptım çalışıyor  philip aşağıdaki gibi yapmış
    //val volumeOfSphere = (4.0 / 3.0) * pi * radius * radius * radius
    println("The volume of the sphere with the $radius is $volumeOfSphere ")
}