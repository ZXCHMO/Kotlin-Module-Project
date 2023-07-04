import java.util.*

fun createNewNote(): Notes {
    val scanner = Scanner(System.`in`)
    println("Введите название новой заметки")
    val name = scanner.nextLine()
    println("Теперь напишите текст заметки")
    val text = scanner.nextLine()
    return Notes(name, text)
}