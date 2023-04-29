import java.util.*

@Suppress("NAME_SHADOWING")
fun main() {

    val commissionInPercentage = 0.0075
    var commission = 0.0

    println("Какой картой вы пользуетесь? Введите номер:")
    println("1. Maestro")
    println("2. MasterCard")
    println("3. Visa")
    println("4. МИР")
    println("5. VK Pay")

    val scanner = Scanner(System.`in`)

    var selectedCard = scanner.nextInt()
    if ((selectedCard < 1) && (selectedCard > 5)) {
        print("Введите номер корректно: ")
        selectedCard = scanner.nextInt()
    }


    println("Введите сумму: ")
    val inputAmount = scanner.nextDouble()
    if (inputAmount <= 0.0) {
        print("Введите корректную сумму:")
        scanner.nextDouble()
    }

    when (selectedCard) {
        1 -> {
            if ((inputAmount > 300.0) && (inputAmount < 75000.0)) {
                    print("Комиссия составляет: $commission")
            } else {
                val commission = inputAmount * commissionInPercentage
                if (commission < 35.0) {
                    val commission = 35.0
                    print("Комиссия составляет: ${(commission).toInt()}")
                }
                print("Комиссия составляет: ${(commission).toInt()}")
            }
        }

        2 -> {
            if ((inputAmount > 300.0) && (inputAmount < 75000.0)) {
                print("Комиссия составляет: ${(commission).toInt()}")
            } else {
                val commission = inputAmount * commissionInPercentage
                if (commission < 35.0) {
                    val commission = 35.0
                    print("Комиссия составляет: ${(commission).toInt()}")
                }
                print("Комиссия составляет: ${(commission).toInt()}")
            }
        }

        3 -> {
            commission = inputAmount * commissionInPercentage
            if (commission < 35.0) {
                print("Ваша комиссия составляет: ${(commission).toInt()}")
            }
            print("Комиссия составляет: ${(commission).toInt()}")
        }

        4 -> {
            commission = inputAmount * commissionInPercentage
            if (commission < 35.0) {
                print("Ваша комиссия составляет: ${(commission).toInt()}")
            }
            print("Комиссия составляет: ${(commission).toInt()}")
        }

        5 -> {
            commission = inputAmount * commissionInPercentage
            print("Ваша комиссия составляет: ${(commission).toInt()}")
        }
    }
}