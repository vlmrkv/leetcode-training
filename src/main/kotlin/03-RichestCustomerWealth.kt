import kotlin.math.max

fun main() {
    //    You are given an m x n integer grid accounts where accounts [i][j] is the
    //    amount of money the i-th customer has in the j-th bank. Return the wealth that
    //    the richest customer has.
    //    A customer 's wealth is the amount of money they have in all their bank accounts.
    //    The richest customer is the customer that has the maximum wealth.
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