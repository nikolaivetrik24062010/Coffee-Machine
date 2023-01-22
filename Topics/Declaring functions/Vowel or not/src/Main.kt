fun isVowel(letter: Char): Boolean = letter in "aeoiuAEOIU"

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
// "aeoiuAEOIU"
//listOf<Char>('a', 'e', ​​'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')