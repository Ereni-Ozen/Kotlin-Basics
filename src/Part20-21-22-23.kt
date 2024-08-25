fun main() {
    val myCircle = Circle(3.0)
    myCircle.changeName("peter")
    println(myCircle.nameOfShape)

    val myTriangle = Triangle(7.0, 7.0, 7.0)
    myTriangle.changeName("Susan")
    println("The name of the triangle is ${myTriangle.nameOfShape}")

    val myRectangle = Rectangle(5.0)

    val maxAreaCompareRectangleAndCircle = maxAreaOfShape(myCircle, myRectangle)
    val maxAreaCompareRectangleCircleTriangle = maxAreaOfShape(myCircle, myRectangle, myTriangle)

    println("The maximum area of rectangle and circle is $maxAreaCompareRectangleAndCircle")
    println("The maximum area of rectangle, circle and triangle is $maxAreaCompareRectangleCircleTriangle")
}

fun maxAreaOfShape(shape1: Shape, shape2: Shape): Double {
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if (areaShape1 > areaShape2) areaShape1 else areaShape2
}

fun maxAreaOfShape(shape1: Shape, shape2: Shape, shape3: Shape): Double {
    val maxAreaShape1Shape2 = maxAreaOfShape(shape1, shape2)
    val areaShape3 = shape3.area()
    return if (maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3

}

