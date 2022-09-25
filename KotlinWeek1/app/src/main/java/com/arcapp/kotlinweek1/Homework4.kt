package com.arcapp.kotlinweek1

import java.util.*

fun main(){

    // Get the Number for Factorial
    val scanner = Scanner(System.`in`)
    print("Enter Number for Factorial: ")

    println(firstFactorial(scanner.nextInt()))

}

fun firstFactorial(num: Int): Int {

    // Set result and count
    var result = 1
    var count = num

    // count greater than 0
    while (count > 0){

        // multiply the number and add
        result *= count
        count--

    }

    return result

}