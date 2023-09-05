package TP7

import kotlin.math.PI

abstract class Forme {
    abstract fun afficher()
    abstract fun aire(): Float
}

class Carre(var largeur: Float, var longueur: Float) : Forme() {
    override fun afficher() {
        println("Carre")
    }
    override fun aire(): Float {
        return largeur * longueur
    }
}

class Cercle(var rayon: Float) : Forme() {
    override fun afficher() {
        println("Cercle")
    }
    override fun aire(): Float {
        return PI.toFloat() * rayon * rayon
    }
}

class Triangle(var largeur: Float, var longueur: Float) : Forme() {
    override fun afficher() {
        println("Triangle")
    }
    override fun aire(): Float {
        return largeur * longueur / 2
    }
}