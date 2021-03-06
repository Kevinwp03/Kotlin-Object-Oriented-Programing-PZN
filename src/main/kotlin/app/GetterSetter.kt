package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("Kevin")
    println(note.title) // Call Getter

    note.title = "" // Call Setter

    println(note.title) // Call Getter

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)

}