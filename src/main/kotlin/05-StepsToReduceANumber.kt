fun main() {
    // Given an integer num, return the number of steps to reduce it to zero.
    // In one step, if the current number is even, you have to divide it by 2, otherwise,
    // you have to subtract 1 from it.
    numberOfSteps(14)
}

fun numberOfSteps(num: Int): Int {
    var count = 0
    var res = num
    while (res >= 1) {
        if (res % 2 == 0) {
            res /= 2
            count += 1
        } else {
            res -= 1
            count += 1
        }
    }
    println(count)
    return count
}