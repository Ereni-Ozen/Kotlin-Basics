import kotlin.math.sqrt

class trianglesAreaAndPeremeters(
    val firstSideOfTriangle: Double,
    val secondSideOfTriangle: Double,
    val thirdSideOfTriangle: Double
) {

    init {
        println("Triangle created with a = $firstSideOfTriangle, b = $secondSideOfTriangle, c = $thirdSideOfTriangle")
        println("Triangle area is ${area()}")
        println("Triangle perimeter is ${perimeter()}")
    }

    fun perimeter() = firstSideOfTriangle + secondSideOfTriangle + thirdSideOfTriangle

    fun area() = sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c))

}