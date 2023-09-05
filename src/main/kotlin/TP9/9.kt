package TP9
fun main() {
    var pers1 = Personne("Reda", 21)
    var pers2 = Personne("Dylan", 21)

    if (pers1.hashCode() == pers2.hashCode()) {
        println("Les objets sont identiques")
    }

    println("Personne 1 "+ pers1.hashCode() + " " +
            pers1.toString() +"\n"+
            "\nPersonne 2" + pers2.hashCode())

}
