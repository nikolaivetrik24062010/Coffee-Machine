fun main() {
    val s = readLine()!!.toLowerCase()
    println(s.filter { it in "gc" }.length * 100.0 / s.length)
}
