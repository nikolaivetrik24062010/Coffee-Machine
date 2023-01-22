fun main() {
    val alphabet = 'a'..'z'
    val word = readln()
    loop@ for (i in alphabet) {
        for (j in word) {
            if (i == j) continue@loop
        }
        print(i)
    }
}