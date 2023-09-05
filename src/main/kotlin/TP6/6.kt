package TP6

fun main() {
    var cpt1 = Compte(100.0)
    cpt1.consulterSolde()
    cpt1.deposer(100.0)
    cpt1.consulterSolde()
    cpt1.retirer(50.0)
    cpt1.consulterSolde()
}

