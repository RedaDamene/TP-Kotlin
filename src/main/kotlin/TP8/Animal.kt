package TP8

abstract class Animal {
    abstract fun doSound()
}

class Chien(var nom: String, type: String, race: String) : Animal() {
    override fun doSound() {
        println("$nom, le chien, aboie.")
    }
}

class Chat( var nom: String, type: String, couleur: String) : Animal() {
    override fun doSound() {
        println("$nom, le chat, miaule.")
    }
}