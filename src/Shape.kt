abstract class Shape(
    var nameOfShape: String
) {
    constructor(name: String, vararg dimensionsOfShape: Double) : this(name)


    init {
        println("I am the super class!")
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double

    fun changeName(newName: String) {
        nameOfShape = newName
    }
}