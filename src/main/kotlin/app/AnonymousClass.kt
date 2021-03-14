package app

import data.Action

fun fireAction(action: Action) {
    action.action()
}

class SampleAction : Action {
    override fun action() {
        println("This is A Sample action")
    }
}

fun main() {
    fireAction(SampleAction())

    //Anonymous Class, Class tanpa nama
    fireAction(object : Action{
        override fun action() = println("Action one")
    })
    fireAction(object : Action{
        override fun action() = println("Action two")
    })
}