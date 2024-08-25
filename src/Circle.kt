import kotlin.random.Random

class Circle(
    val radius: Double
) : Shape("Circle") {

    companion object {
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }


    init {
        println("$nameOfShape created with radius = $radius")
        println("$nameOfShape area is ${area()}")
        println("$nameOfShape perimeter is ${perimeter()}")
    }

    override fun area() = radius * radius * ImportantNumbers.Pi
    override fun perimeter() = 2 * radius * ImportantNumbers.Pi
}