package com.example.calc

fun main() {

    /* Приветствие с пользователем */

    val nameBot = "DICT_Bot"
    println("Hello! My name is " + nameBot)
    println("Please, remind me your name.")
    val nameUser = readln().toString()
    println("What a great name you have, " + nameUser + "!")

    /* Бот угадывает возраст */

    println("Let me guess your age.\n" +
            "Enter remainders of dividing your age by 3, 5 and 7.")
    val remaindersBy3 = readln().toInt()
    val remaindersBy5 = readln().toInt()
    val remaindersBy7 = readln().toInt()
    val age = (remaindersBy3 * 70 + remaindersBy5 * 21 + remaindersBy7 * 15) % 105
    println("Your age is " + age)

    /* Подсчет до заданного числа */

    println("Now I will prove to you that I can count to any number you want.")
    val num = readln().toInt()
    var i = 0
    while (i <= num) {
        println(i)
        i++
    }

    /* Тест */

    println("Let's test your programming knowledge.\n" +
            "Why do we use methods?\n" +
            "1. To repeat a statement multiple times.\n" +
            "2. To decompose a program into several small subroutines.\n" +
            "3. To determine the execution time of a program.\n" +
            "4. To interrupt the execution of a program.")
    do {
        val correctAns = 4
        val ans = readln().toInt()
        if (ans != correctAns)
            println("Please, try again.")
    } while (ans != correctAns)
    println("Completed!\n" +
            "Congratulations, have a nice day!")
}