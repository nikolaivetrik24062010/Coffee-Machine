fun main() {
    val str = readln()
    val numStr = readln().toInt()
    println("Symbol # $numStr of the string \"$str\" is \'${str[numStr - 1]}\'")
}