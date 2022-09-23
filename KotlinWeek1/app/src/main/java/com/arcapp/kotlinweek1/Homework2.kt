package com.arcapp.kotlinweek1

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)
    print("Enter Numbers Leaving Spaces: ")

    val numbers = scanner.nextLine().split(" ").map { it.toLong() }
    println(aVeryBigSum(numbers))

}

fun aVeryBigSum(arr:List<Long>) : Long{

    var sum = 0L
    for(i in arr) sum += i
    return sum

}