package TP2

fun main() {
    var personne1 = Personne("Damene", 21, "Développeur Symfony")

    print("Personne : ${personne1.nom}\n");
    print("Personne : ${personne1.age}\n");
    print("Personne : ${personne1.poste}\n");

    var personne2 = Personne2("Alice Smith");

    print(personne2.toString())
}