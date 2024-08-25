import com.sun.jdi.Value
import kotlin.math.pow


fun main() {
    // iki durumda da sonuç olarak variable ne değer alıcak onu tahmin etmemizi istedi
    //logic ve comparison operator'leri anlatmak için
    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
    println(simpleExpression)
    //true tahmin ettim

    val bool = true
    val x = 9
    val y = 3
    val z = 9

    val hardExpression = !(x != z) && bool || z > (x + y) && (!bool || y < z)
    println(hardExpression)
    //true tahmin ettim
}