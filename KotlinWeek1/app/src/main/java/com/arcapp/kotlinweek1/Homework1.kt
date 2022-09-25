package com.arcapp.kotlinweek1

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)
    print("Enter Username: ")

    // Get the username
    val username = scanner.next()
    println("Username Is Valid: ${usernameValidation(username)}")

}

fun usernameValidation(username:String) : Boolean{

    // Checking the username between 4 and 24 characters?
    if(username.length < 4 || username.length > 25) return false

    // Is the first character a letter?
    if(!username.first().isLetter()) return false


    for(c in username){

        // Check if it contains only letters, characters and underscores
        if(!c.isDigit() && !c.isLetter() && c != '_'){
            return false
        }

    }

    // Check that the last character will not be underscore
    if(username.last() == '_') return false

    return true

}