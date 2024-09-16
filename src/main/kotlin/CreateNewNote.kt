fun createNewNote(): Notes {
    println("Введите название новой заметки")
    val name = userInputName()
    println("Теперь напишите текст заметки")
    val text = userInputName()
    return Notes(name, text)
}