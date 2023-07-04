import java.util.Scanner

fun userInput(size: Int): Int {
    val scanner = Scanner(System.`in`)
    while (true) {
        return if (scanner.hasNextInt()) {
            val x = scanner.nextInt()
            if (x > size + 1 || x < 0) {
                println("Такого числа нет на экране!\nВведите корректное число!")
                -1
            } else {
                x
            }
        } else {
            println("Следует ввсети число!")
            scanner.next()
            -1
        }
    }
}