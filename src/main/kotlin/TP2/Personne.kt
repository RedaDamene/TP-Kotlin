package TP2

class Personne constructor(val nom: String, var age: Int, var poste:String) {

}

class Personne2 {
    var nom: String = ""
    var age = 0
    var poste = "Non défini"

    constructor(nom: String) {
        this.nom = nom
    }

    constructor(nom: String, age: Int, poste:String) {
        this.nom = nom
        this.age = age
        this.poste = poste
    }

    override fun toString(): String {
        return "Nom :'$nom' \nAge=$age \nPoste='$poste'"
    }


}