import java.util.*

fun createNewArchive(): Archive {
    val scanner = Scanner(System.`in`)
    println("Введите название нового архива")
    return Archive(scanner.nextLine())


}