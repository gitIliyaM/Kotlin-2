package ru.otus.homework

fun main() {
    val numbers1 = intArrayOf(2, 7, 11, 15)
    val target1 = 9
    val result1 = sumOfTwo(numbers1, target1)
    println("Результат 1: ${result1.contentToString()}")

    val numbers2 = intArrayOf(3, 2, 4)
    val target2 = 6
    val result2 = sumOfTwo(numbers2, target2)
    println("Результат 2: ${result2.contentToString()}")

    val numbers3 = intArrayOf(1, 2, 3)
    val target3 = 10
    try {
        val result3 = sumOfTwo(numbers3, target3)
        println("Результат 3: ${result3.contentToString()}")
    } catch (e: IllegalArgumentException) {
        println("Ошибка: ${e.message}")
    }
}

fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    for (i in numbers.indices) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] + numbers[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }

    throw IllegalArgumentException("Пары чисел с заданной суммой не существует")
}