package com.arcapp.kotlinweek1

import java.util.*

fun main(){

    // Get the input
    val scanner = Scanner(System.`in`)
    print("Enter Input: ")

    println(questionsMarks(scanner.next()))

}

fun questionsMarks(str: String): String {

    // question mark count
    var qMarkCount = 0
    var lastDigit = -1
    var result = "false"

    // rotate the characters
    for (char in str) {

        // if the character is a number
        if (char.isDigit()) {

            val digit = Integer.valueOf(char.toString())  // get the digit
            val sum = digit + lastDigit // we add the sum current number with the old number
            lastDigit = digit  // determine the last number

            if (sum != 10) {   // if the sum is not equal to 10 question mark = 0 and continue
                qMarkCount = 0
                continue
            }

            // true if there are 3 question marks, false otherwise
            if (qMarkCount == 3){
                result = "true"
            }else{
                result = "false"
            }

            qMarkCount = 0

        } else if (char == '?'){  // if the character is a question mark increase
            qMarkCount++
        }

    }

    return result;

}