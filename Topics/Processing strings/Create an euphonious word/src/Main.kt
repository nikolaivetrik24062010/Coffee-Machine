fun main() {
    val vows = "aeiouy"
    val str = readLine()!!
    var n = 0
    var i = 0
    while (i <= str.lastIndex - 2) {
        if (str[i] in vows && str[i + 1] in vows && str[i + 2] in vows) {
            n++
            i += 2
        } else if (str[i] !in vows && str[i + 1] !in vows && str[i + 2] !in vows) {
            n++
            i += 2
        } else i++
    }
    print(n)
}
