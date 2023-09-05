package TP7

fun main() {
    var formes = arrayOf(
        Carre(10f, 20f),
        Cercle(10f),
        Triangle(10f, 20f)
    )
    for (i in 0..formes.size-1)
    {
        print(" \n"+formes[i].afficher()+"\n"+formes[i].aire())
        println("\n---------------------------------------")
    }
}
