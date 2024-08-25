import kotlin.math.sqrt

class Triangle(
    val a: Double, val b: Double, val c: Double
) : Shape("triangle") {

    init {
        println("$nameOfShape created with a = $a, b = $b, c = $c")
        println("$nameOfShape area is ${area()}")
        println("$nameOfShape perimeter is ${perimeter()}")
    }

    override fun area() = sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c))

    override fun perimeter() = a + b + c

}