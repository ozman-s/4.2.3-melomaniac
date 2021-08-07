package ru.netology

fun main() {
    val buyNow = 1500
    val buyPast = 50000
    val constantClient = true // false

    val discountBorderFirst = 1_001
    val discountBorderSecond = 10_001
    val discountFirst = 100
    val discountSecond = (buyNow/100)*5
    val discountConstantClient: Int = (buyNow/100)*1

    var discountSumma = if ((buyPast >= discountBorderFirst) && (buyPast < discountBorderSecond) && constantClient) {
        println("Покупка на $buyNow руб. Скидка $discountFirst руб. Стоимость покупки с учетом скидки: ${buyNow-discountFirst} руб.")
        println("Вы постоянный клиент! Ваша дополнительная скидка 1%. Итоговая сумма к оплате: ${(buyNow-discountFirst)-discountConstantClient}")

    } else if ((buyPast >= discountBorderFirst) && (buyPast < discountBorderSecond)) {
        println("Покупка на $buyNow руб. Ваша текущая скидка $discountFirst руб. Cумма к опалте: ${buyNow - discountFirst} руб.")

    } else if (buyPast >= discountBorderSecond && constantClient) {
        println("Покупка на $buyNow руб. Скидка 5%. Стоимость покупки с учетом скидки: ${buyNow-discountSecond} руб.")
        println("Вы постоянный клиент! Ваша дополнительная скидка 1%. Итоговая сумма к оплате: ${(buyNow-discountSecond)-discountConstantClient}")

    } else if (buyPast >= discountBorderSecond) {
        println("Покупка на $buyNow руб. Ваша текущая скидка 5%. Итоговая сумма к опалте: ${buyNow-discountSecond} руб.")

    } else if (buyPast < discountBorderFirst && constantClient) {
        println("Покупка на $buyNow руб.")
        println("Вы постоянный клиент! Ваша дополнительная скидка 1%. Итоговая сумма к оплате: ${buyNow - discountConstantClient}")

    } else {
        println("Сумма к оплате $buyNow руб.")
    }
}
