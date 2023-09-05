package TP5

open class Forme {
    open fun afficher() {
        println("Forme générique")
    }
}

class Carre(var largeur: Int, var longueur: Int) : Forme() {
    override fun afficher() {
        println("Carre")
    }

    override fun toString(): String {
        return "Carre(largeur=$largeur, longueur=$longueur)"
    }
}

class Rectangle(var largeur: Int, var longueur: Int) : Forme() {
    override fun afficher() {
        println("Rectangle")
    }

    override fun toString(): String {
        return "Rectangle(largeur=$largeur, longueur=$longueur)"
    }
}

class Cercle(var rayon: Int) : Forme() {
    override fun afficher() {
        println("Cercle")
    }

    override fun toString(): String {
        return "Cercle(rayon=$rayon)"
    }
}

class  Triangle(var base : Int, var hauteur : Int) : Forme() {
    override fun afficher() {
        println("Triangle")
    }

    override fun toString(): String {
        return "Triangle(base=$base, hauteur=$hauteur)"
    }
}