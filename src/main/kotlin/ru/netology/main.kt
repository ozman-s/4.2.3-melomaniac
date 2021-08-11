package ru.netology

fun main() {
    val buyNow = 1_000
    val buyPast = 1_001
    val clientConstant = true //false

    val discountFirst = buyNow - 100
    val discountSecond = buyNow - (buyNow / 100) * 5
    val discountConstantClient = (buyNow / 100) * 1


    val calculateDiscount =
        when (buyPast) {
            in 1..1_000 -> buyNow
            in 1_001..10_001 -> discountFirst
            else -> discountSecond
        }
    val calculatePercent =
        when (buyPast) {
            in 1..1_000 -> ""
            in 1_001..10_001 -> "Скидка 100 руб. Стоимость покупки с учетом скидки: $calculateDiscount руб."
            else -> "Скидка 5%. Стоимость покупки с учетом скидки: $calculateDiscount руб."
        }

    println("Покупка на $buyNow руб. $calculatePercent")

    if (clientConstant) {
        println(
            "Вы постоянный клиент! Ваша дополнительная скидка 1%. Итоговая сумма к оплате: " +
                    "${calculateDiscount - discountConstantClient}"
        )
    }
}


