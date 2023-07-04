class Archives {


    private var arrayArchives = mutableListOf<Archive>()

    fun start() {
        while (true) {
            println("===Список архивов===\n0. Создать архив")
            menuOutput(arrayArchives, true)

            when (val x = userInput(arrayArchives.size)) {
                0 -> arrayArchives.add(createNewArchive())
                in 1..arrayArchives.size -> arrayArchives[x - 1].start()
                arrayArchives.size + 1 -> break
            }
        }
    }
}