fun main() {
    val inputNumbers = readln()
    val firstNum = inputNumbers[0].toInt()
    val secondNum = inputNumbers[1].toInt()
    val thirdNum = inputNumbers[2].toInt()
    val fourthNum = inputNumbers[3].toInt()
    val fifthNum = inputNumbers[4].toInt()
    val sixthNum = inputNumbers[5].toInt()
    if (firstNum + secondNum + thirdNum == fourthNum + fifthNum + sixthNum) {
        println("Lucky")
    } else {
        println("Regular")
    }

}