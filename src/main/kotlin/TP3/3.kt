package TP3

fun main(args: Array<String>) {
    var emp1 = Employee("Reda", 21, "Developpeur", 1890.0f)
    var emp2 = Employee("Dylan", 21, "Manager", 1500f)
    var emp3 = Employee("Killian", 23, "Comptable", 2200f)

    println("Avant augmentation")

    println(emp1.afficherInformations())
    println(emp2.afficherInformations())
    println(emp3.afficherInformations())

    emp1.augmenterSalaire()
    emp2.augmenterSalaire()
    emp3.augmenterSalaire()

    println("Après augmentation")

    println(emp1.afficherInformations())
    println(emp2.afficherInformations())
    println(emp3.afficherInformations())
}