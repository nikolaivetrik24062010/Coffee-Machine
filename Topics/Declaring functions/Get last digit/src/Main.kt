import kotlin.math.abs

fun getLastDigit(a: Int) = abs(a % 10)

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}