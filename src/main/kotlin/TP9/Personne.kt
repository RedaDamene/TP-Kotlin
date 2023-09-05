package TP9

data class Personne(val nom: String, val age: Int) {
    override fun toString(): String {
        return "Personne(nom='$nom', age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Personne

        if (nom != other.nom) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nom.hashCode()
        result = 31 * result + age
        return result
    }


}