package TP11

class Etudiant {
    lateinit var nom: String
    lateinit var age: String
    lateinit var numeroEtudiant: String

    constructor(nom: String, age: Int, numeroEtudiant: String) {
        this.nom = nom
        this.age = age.toString()
        this.numeroEtudiant = numeroEtudiant
    }

}