package TP5

fun main() {
    val formes = arrayOf(Carre(10, 20), Rectangle(10, 20), Cercle(10), Triangle(10, 20))
    for (i in 0..formes.size-1)
    {
        print(" \n"+formes[i].afficher()+"\n"+formes[i].toString())
        println("\n---------------------------------------")
    }
}