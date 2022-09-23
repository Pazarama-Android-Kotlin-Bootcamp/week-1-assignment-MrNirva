package com.arcapp.kotlinweek1

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)
    print("Enter Input: ")

    println(questionsMarks(scanner.next()))

}

fun questionsMarks(str: String): String {

    var qMarkCount = 0
    var lastDigit = -1
    var result = "false"

    for (char in str) {

        if (char.isDigit()) {

            val digit = Integer.valueOf(char.toString())
            val sum = digit + lastDigit
            lastDigit = digit

            if (sum != 10) {
                qMarkCount = 0
                continue
            }

            if (qMarkCount == 3){
                result = "true"
            }else{
                result = "false"
            }

            qMarkCount = 0

        } else if (char == '?'){
            qMarkCount++
        }

    }

    return result;

}