package data

sealed class Operation (val name: String)

class Plus: Operation("Plus") // menjadi class parent
class Minus: Operation("Minus") // menjadi class parent