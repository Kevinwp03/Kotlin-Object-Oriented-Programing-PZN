package app

import data.Account

fun main() {
    val account = Account()
    account.description = "Contoh"
    account.description = "OldValue"
    account.description = "NewValue"
}