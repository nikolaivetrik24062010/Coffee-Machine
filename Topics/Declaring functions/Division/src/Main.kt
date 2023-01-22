fun divide(a: Long, b: Long): Double {
    val x = a.toDouble()
    val z = b.toDouble()
    val y = x / z
    return y
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}