fun main() {
    val palindrome = readln()
    println(if (palindrome == palindrome.reversed()) "yes" else "no")
}