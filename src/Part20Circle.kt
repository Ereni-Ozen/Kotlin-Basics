class circlesAreaAndPerimeter(
    val radius: Double
) {
    val pi = 3.141592

    init {
        println("Circle created with radius = $radius")
        println("Circle area is ${area()}")
        println("Circle perimeter is ${perimeter()}")
    }

    fun area() = radius * radius * pi
    fun perimeter() = 2 * radius * pi
}