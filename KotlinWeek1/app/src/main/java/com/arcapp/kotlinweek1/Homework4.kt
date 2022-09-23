package com.arcapp.kotlinweek1

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)
    print("Enter Number for Factorial: ")

    println(firstFactorial(scanner.nextInt()))

}

fun firstFactorial(num: Int): Int {

    var result = 1
    var count = num

    while (count > 0){
        result *= count
        count--
    }

    return result

}