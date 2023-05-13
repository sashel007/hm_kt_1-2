import java.util.*

fun main() {

    val commissionInPercentage = 0.0075
    var commission = 0.0
    val minCommission = 35.0

    println("Какой картой вы пользуетесь? Введите номер:")
    println("1. Maestro")
    println("2. MasterCard")
    println("3. Visa")
    println("4. МИР")
    println("5. VK Pay")

    var selectedCard = readln().toInt()
    if ((selectedCard < 1) && (selectedCard > 5)) {
        print("Введите номер корректно: ")
        selectedCard = readln().toInt()
    }

    println("Введите сумму: ")
    val inputAmount = readln().toDouble()
    if (inputAmount <= 0.0) {
        print("Введите корректную сумму:")
        inputAmount
    }

    when (selectedCard) {
        in 1 .. 5 -> {
            commission = inputAmount * commissionInPercentage
            if (commission < 35.0) {
                print("Ваша комиссия составляет: ${minCommission.toInt()}")
            } else {
                print("Комиссия сос тавляет: ${(commission).toInt()}")
            }
        }

    }
}