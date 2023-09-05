package TP10
class Banque {
    class Compte(private var solde: Double) {
        fun deposer(montant: Double) {
            if (montant > 0.0) {
                this.solde += solde
            } else {
                println("Montant incorrect")
            }
        }

        fun retirer(solde: Double) {
            if (solde > 0.0) {
                this.solde -= solde
            } else {
                println("Solde insuffisant")
            }
        }

        fun consulterSolde() {
            println("Solde: $solde")
        }
        inner class Inner {
            fun transactions() {
                println("Transactions: ")
            }
        }
    }
}