package TP4

open class Animal constructor(var nom: String, var type: String){

    open fun doSound(){
        println("Bruitage de l'animal")
    }
}

class Chien(nom: String, type: String, val race: String) : Animal(nom, type) {
    override fun doSound() {
        println("$nom, le chien, aboie.")
    }
}

class Chat(nom: String, type: String, val couleur: String) : Animal(nom, type) {
    override fun doSound() {
        println("$nom, le chat, miaule.")
    }
}

class Aigle(nom: String, type: String, val envergure: Double) : Animal(nom, type), Voleur {
    override fun doSound() {
        println("$nom, l'aigle, pousse un cri perçant.")
    }

    override fun voler() {
        println("$nom, l'aigle, vole dans le ciel.")

    }
}

class Dauphin (nom: String, type: String, val couleurScales: String) : Animal(nom, type), Nageur {
     override fun doSound() {
        println("$nom, le dauphin, émet un son étrange.")
    }

    override fun nager() {
        println("$nom, l'aigle, nage dans l'océan.")

    }
}

interface Nageur {
    fun nager()
}

// Interface pour les animaux volants
interface Voleur {
    fun voler()
}