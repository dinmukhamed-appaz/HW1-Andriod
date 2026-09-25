fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    val subFirst = subtract(firstNumber, secondNumber)
    val subSecond = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    println("$firstNumber - $secondNumber = $subFirst")
    println("$firstNumber - $thirdNumber = $subSecond")
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun subtract(num1: Int, num2: Int): Int {
    return num1 - num2
}