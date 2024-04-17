package com.example.rockpaper

fun main() {
    var computerChoice = ""
    var userChoice = ""
    println("Rock, Paper, Scissor? Enter Your Choice!")

    userChoice = readln()
    while (userChoice != "rock" && userChoice != "paper" && userChoice != "scissor") {

        println("Enter Valid Choice!")
        userChoice = readln()
    }

    when ((1..3).random()) {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 ->  computerChoice = "Scissor"
    }
    println(computerChoice)

    val winner = when {
        userChoice == computerChoice -> "Tie"
        userChoice == "rock" && computerChoice == "Scissor" -> "Player"
        userChoice == "paper" && computerChoice == "Rock" -> "Player"
        userChoice == "scissor" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie") {
        println("It's a tie.")
    } else {
        println("$winner won!")
    }
}