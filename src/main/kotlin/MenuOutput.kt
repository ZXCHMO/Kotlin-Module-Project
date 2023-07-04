fun menuOutput(someArray: List<Any>, firstMenu: Boolean) {
    if (someArray.isEmpty()) {
        if (firstMenu) {
            println("1. Выход из приложения")
        } else {
            println("1. Вернуться в предыдущее меню")
        }

    } else {
        for (i in 1..someArray.size) {
            println("$i. ${someArray[i - 1]}")
            if (i == someArray.size) {
                if (firstMenu) {
                    println("${i + 1}. Выход из приложения")
                } else {
                    println("${i + 1}. Вернуться в предыдущее меню")
                }

            }
        }
    }

}