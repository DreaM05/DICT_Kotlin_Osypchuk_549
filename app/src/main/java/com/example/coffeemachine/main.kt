package com.example.coffeemachine

import java.util.*

fun main() {
    println("Starting to make a coffee in NIX office\n" + "Grinding coffee beans\n" + "Boiling water\n" + "Mixing boiled water with crushed coffee beans\n" + "Pouring coffee into the cup\n" + "Pouring some milk into the cup\n" + "Coffee is ready! Go to work!")
    val scan = Scanner(System.`in`)

    val water_needed = 200
    val milk_needed = 50
    val coffee_beans_needed = 15
    println("Write how many ml of water the coffee machine has:")
    val water_of_mach: Int = scan.nextInt()
    println("Write how many ml of milk the coffee machine has:")
    val milk_of_mach: Int = scan.nextInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val coffee_beans_of_mach: Int = scan.nextInt()
    println("Write how many cups of coffee you will need:")
    val cup_of_coffee: Int = scan.nextInt()
    val water_of_coffee: Int = water_of_mach / water_needed
    val milk_of_coffee: Int = milk_of_mach / milk_needed
    val beans_of_coffee: Int = coffee_beans_of_mach / coffee_beans_needed
    val coffee = intArrayOf(water_of_coffee, milk_of_coffee, beans_of_coffee)
    val min = coffee.min()
    val N = min - cup_of_coffee
    if (min == cup_of_coffee) {
        println("Yes, I can make that amount of coffee")
    } else if (min > cup_of_coffee) {
        println("Yes, I can make that amount of coffee (and even $N more than that)")
    } else {
        println("No, I can make only $min cups of coffee")
    }
}