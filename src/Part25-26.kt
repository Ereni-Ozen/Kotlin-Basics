fun main() {
    //part 25
    val circle = Circle.randomCircle()
    val rectangle = Rectangle.randomRectangle()

    //Part 26
    val firstSideOfParallelogram = 3.0
    val secondSideOfParallelogram = 4.0
    val heightOfParallelogram = 2.0
    val parallelogram = object : Shape(
        "Parallelogram",
        firstSideOfParallelogram,
        secondSideOfParallelogram,
        heightOfParallelogram
    ) {

        init {
            println("$nameOfShape created with firstSideOfParallelogram = $firstSideOfParallelogram, " +
                    "secondSideOfParallelogram = $secondSideOfParallelogram and" +
                    " heightOfParallelogram = $heightOfParallelogram")
            println("the area is ${area()}")
            println("the perimeter is ${perimeter()}")
        }
        override fun area(): Double {
            return firstSideOfParallelogram * heightOfParallelogram
        }

        override fun perimeter(): Double {
            return 2 * firstSideOfParallelogram + 2 * secondSideOfParallelogram
        }

        fun isRectangle(): Boolean = secondSideOfParallelogram == heightOfParallelogram
    }

    println("is the Parallelogram a rectangle? ${parallelogram.isRectangle()}")

}