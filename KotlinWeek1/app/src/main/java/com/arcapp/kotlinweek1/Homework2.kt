package com.arcapp.kotlinweek1

import java.util.*

fun main(){

    // Get the Numbers
    val scanner = Scanner(System.`in`)
    print("Enter Numbers Leaving Spaces: ")

    // Received numbers are split with spaces and converted to long
    val numbers = scanner.nextLine().split(" ").map { it.toLong() }
    println(aVeryBigSum(numbers))

}

fun aVeryBigSum(arr:List<Long>) : Long{

    // We return the list with for and sum the values
    var sum = 0L
    for(i in arr) sum += i

    // Return sum
    return sum

}