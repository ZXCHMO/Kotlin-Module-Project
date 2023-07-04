class Archive(private val name: String) {
    private var arrayNotes = mutableListOf<Notes>()
    override fun toString(): String = name
    fun start() {
        while (true) {
            println("===Список заметок===\n0. Создать заметку")
            menuOutput(arrayNotes, false)
            when (val x = userInput(arrayNotes.size)) {
                0 -> arrayNotes.add(createNewNote())
                in 1..arrayNotes.size -> arrayNotes[x - 1].start()
                arrayNotes.size + 1 -> break
            }
        }
    }
}