package TP4

fun main() {
    var chien = Chien("Fido", "Chien", "Labrador")
    chien.doSound()

    var chat = Chat("Mimi", "Chat", "Blanc")
    chat.doSound()

    var aigle = Aigle("Aigle", "Aigle", 1.2)
    aigle.doSound()
    aigle.voler()

    var dauphin = Dauphin("Dauphin", "Dauphin", "Blanc")
    dauphin.doSound()
    dauphin.nager()

}
