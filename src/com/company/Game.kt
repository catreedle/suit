package com.company

import Player

class Game {
    fun startGame() {
        println("========================== \nGAME SUIT TERMINAL VERSION \n==========================")
        println("Masukkan Pemain 1")
        var input1 = readLine().toString()
        println("Masukkan Pemain 2")
        var input2 = readLine().toString()
        val pemain1 = Player(input1)
        val pemain2 = Player(input2)

        val hasilGame = compare(pemain1, pemain2)
        println("Hasil: \n$hasilGame")
    }

    fun compare(player1: Player, player2: Player): String {
        var result = "unknown"
        val weapon1 = player1.playerWeapon
        val weapon2 = player2.playerWeapon

        when(weapon1) {
            "gunting" -> {
                when(weapon2) {
                    "gunting" -> result = "DRAW"
                    "batu" -> result = "Pemain 2 Menang"
                    "kertas" -> result = "Pemain 1 Menang"
                     else -> result = "Invalid input. Masukkan gunting, batu, atau kertas!"
                }
            }
            "batu" -> {
                when(weapon2) {
                    "gunting" -> result = "Pemain 1 Menang"
                    "batu" -> result = "DRAW"
                    "kertas" -> result = "Pemain 2 Menang"
                     else -> result = "Invalid input. Masukkan gunting, batu, atau kertas!"
                }
            }
            "kertas" -> {
                when(weapon2) {
                    "gunting" -> result = "Pemain 2 Menang"
                    "batu" -> result = "Pemain 1 Menang"
                    "kertas" -> result = "DRAW"
                     else -> result = "Invalid input. Masukkan gunting, batu, atau kertas!"
                }
            }
            else -> result = "Invalid input. Masukkan gunting, batu, atau kertas!"
        }
        return result
    }
}

fun main() {
    val permainan = Game()
    permainan.startGame()
}
