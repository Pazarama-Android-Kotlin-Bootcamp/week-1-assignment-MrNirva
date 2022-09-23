package com.arcapp.kotlinweek1

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)
    print("Enter Username: ")

    val username = scanner.next()
    println("Username Is Valid: ${usernameValidation(username)}")

}

fun usernameValidation(username:String) : Boolean{

    if(username.length < 4 || username.length > 25) return false

    if(!username.first().isLetter()) return false

    for(c in username){

        if(!c.isDigit() && !c.isLetter() && c != '_'){
            return false
        }

    }

    if(username.last() == '_') return false

    return true

}