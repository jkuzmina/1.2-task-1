import kotlin.math.roundToInt

fun main(){
    val amount = 1000000
    println(formatResult(commission(amount)))
}

fun commission(amount: Int): Int {
    val MIN_COMMISSION = 3_500
    val result = (0.75 * amount).roundToInt()
    return if(result < MIN_COMMISSION) {
        MIN_COMMISSION
    } else {
        result
    }
}

fun formatResult(amount: Int): String {
    return "Размер комиссии: $amount копеек"}
