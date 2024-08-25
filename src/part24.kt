fun main() {
    val myList = listOf(1, 2, 3, 4, 5)
    val myArray = arrayOf(1, 2, 3, 4, 5)

    println("List: $myList")

    printAlternatingly(myArray)
}



fun printAlternatingly(list: List<Int>) {
    var counterLeftToRight = 0
    var counterRightToLeft = list.size - 1
    var switch = true
    while (counterLeftToRight <= counterRightToLeft){
        if(switch){
            println(list[counterLeftToRight])
            counterLeftToRight++
        }else {
            println(list[counterRightToLeft])
            counterRightToLeft--
        }
        switch = !switch
    }
}

fun printAlternatingly(array: Array<Int>) {
    var counterLeftToRight = 0
    var counterRightToLeft = array.size - 1
    var switch = true
    while (counterLeftToRight <= counterRightToLeft){
        if(switch){
            println(array[counterLeftToRight])
            counterLeftToRight++
        }else {
            println(array[counterRightToLeft])
            counterRightToLeft--
        }
        switch = !switch
    }
}