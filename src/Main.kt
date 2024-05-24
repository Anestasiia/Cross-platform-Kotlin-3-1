import kotlin.math.pow
import kotlin.math.abs
import kotlin.math.sin

fun main() {
    println("Завдання №1")
    val precision = 0.00001

    print("Введіть значення х: ")
    val x: Double = readln().toDouble()
    val fLeft = sin(x)
    var fRight = x
    var a = x
    var k = 1

    do {
        a *= (-1) * x.pow(2.0) / ((2 * k) * (2 * k + 1))
        fRight += a
        k++
    } while (abs(a) >= precision)

    println("Кількість додатнів: $k")
    println("Ліва частина: $fLeft")
    println("Права частина: $fRight")
    println("Різниця лівої частини до правої: " + (fLeft - fRight))
}

