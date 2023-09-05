package TP3

class Employee constructor(val nom: String, var age: Int, var poste:String, var salaire:Float) {

    fun afficherInformations(): String {
        return "TP3.Employee(nom='${this.nom}', age=${this.age}, poste='${this.poste}', salaire=${this.salaire})"
    }

    fun augmenterSalaire() {
        if (this.poste == "Manager") {
            this.salaire *= 1.1f;
        } else if (this.poste == "Developpeur") {
            this.salaire *= 1.15f;
        } else if (this.poste == "Comptable") {
            this.salaire *= 1.12f;
        }
    }

}