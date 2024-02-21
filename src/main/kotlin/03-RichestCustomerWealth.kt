import kotlin.math.max

fun main() {
    val startTime = System.nanoTime() * 0.000001
    val accounts = arrayOf(
        arrayOf(1, 2, 3), arrayOf(3, 2, 1), arrayOf(6, 10, 20)
    )
    var maxWealth = 0
    for (customer in accounts) {
        var currentCustomerWealth = 0
        for (bank in customer) {
            currentCustomerWealth += bank
        }
        maxWealth = max(maxWealth, currentCustomerWealth)
    }
    val endTime = System.nanoTime() * 0.000001
    println(maxWealth)
    println(endTime - startTime)
}