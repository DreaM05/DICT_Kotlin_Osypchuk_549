package com.example.coffeemachine

import java.util.*

fun main() {
    println("Starting to make a coffee in NIX office\n" + "Grinding coffee beans\n" + "Boiling water\n" + "Mixing boiled water with crushed coffee beans\n" + "Pouring coffee into the cup\n" + "Pouring some milk into the cup\n" + "Coffee is ready! Go to work!")
    val scan = java.util.Scanner(System.`in`)

    val water = 200
    val milk = 50
    val coffee_beans = 15
    println("Write how many cups of coffee you will need:")
    val cup = scan.nextInt()
    println("For " + cup + " cups of coffee you will need: \n" + (water * cup) + " ml of water\n" + (milk * cup) + " ml of milk\n" + (coffee_beans * cup) + " g of coffee beans\n")

}