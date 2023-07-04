class Notes(private val name: String, private val text: String) {
    override fun toString(): String = name
    fun start() {
        while (true) {
            println("====================\nВыбрана заметка: $name\n0. Посмотреть текст заметки\n1. Вернуться в предыдущее меню")
            when (userInput(0)) {
                0 -> println("====================\nТекст заметки ${name}: \n$text")
                1 -> break
            }
        }
    }
}