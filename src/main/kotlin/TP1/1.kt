package TP1

import java.util.Scanner

fun main(args: Array<String>) {
    var nom: String
    var prix: Float? = null
    var stock: Int = 0
    var code: String
    var promotion: Boolean = false

    val reader = Scanner(System.`in`)

    while (prix == null) {
        println("Entrer un prix")
        if (reader.hasNextFloat()) {
            prix = reader.nextFloat()
            println("prix: $prix")
        } else {
            reader.next()
            println("Le prix doit être un nombre flottant")
        }
    }

    /*
    var monAutreFloat: Float? = null

    while (monAutreFloat == null) {
        println("Entrer un autre float")
        monAutreFloat = if (reader.hasNextFloat()) reader.nextFloat() else {
            reader.next()
            null
        }
        println(monAutreFloat)
    }
     */

    /*
    try {
        println("Entrez un nom de produit")
        nom = reader.nextLine()

        println("Entrez un prix")
        prix = reader.nextFloat()
        println("Vous avez choisi le produit : $nom au prix de $prix€")
    } catch (error: InputMismatchException) {
        println("Le prix entré n'est pas valide")
    } finally {
        println("Fin de l'opération")
    }
     */
}