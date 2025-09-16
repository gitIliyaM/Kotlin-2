package ru.otus.homework

fun main() {
    val testResult = fizzbuzz(5)
    println("Результат для n=5: ${testResult.contentToString()}")

    val testResult2 = fizzbuzz(16)
    println("Результат для n=16: ${testResult2.contentToString()}")
}
fun fizzbuzz(n: Int): Array<String> {

    val resultWithWhen = Array(n) { "" }
    for (i in 0 until n) {
        resultWithWhen[i] = when {
            i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i.toString()
        }
    }

    val resultWithIf = Array(n) { "" }
    for (i in 0 until n) {
        if (i % 3 == 0 && i % 5 == 0) {
            resultWithIf[i] = "FizzBuzz"
        } else if (i % 3 == 0) {
            resultWithIf[i] = "Fizz"
        } else if (i % 5 == 0) {
            resultWithIf[i] = "Buzz"
        } else {
            resultWithIf[i] = i.toString()
        }
    }

    if (!resultWithWhen.contentEquals(resultWithIf)) {
        throw IllegalStateException("Результаты способов не совпадают!")
    }

    return resultWithWhen
}