import kotlin.random.Random

open class Rectangle(
    val firstSide: Double,
    val secondSide: Double
) : Shape("Rectangle") {

    companion object{
        fun randomRectangle(): Rectangle{
            val firstSide = Random.nextDouble(1.0,10.0)
            val secondSide = Random.nextDouble(1.0,10.0)
            return Rectangle(firstSide, secondSide)
        }

    }

    constructor(a: Double): this(a, a)

    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())

    init {
        println("$nameOfShape created according to a: $firstSide and b: $secondSide")
        println("$nameOfShape's area is ${area()}")
        println("$nameOfShape's perimeter is ${perimeter()}")
        println("is $nameOfShape a square? ${isSquare()}")
    }

    override fun area(): Double = firstSide * secondSide

    override fun perimeter(): Double = 2 * firstSide + 2 * secondSide

    fun isSquare(): Boolean = firstSide == secondSide
}