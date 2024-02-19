fun main() {
    val numbers = intArrayOf(2, 7, 11, 15)
    val target = 9
    twoSum(numbers, target)
}


fun twoSum(numbers: IntArray, target: Int): Array<Int> {
    var result = arrayOf<Int>()
    for (i in 0 until numbers.lastIndex) {
        while (i != (numbers.lastIndex - 1)) {
            if ((numbers[i] + numbers[i + 1]) == target) {
                result.plusElement(i)
                result.plusElement(i + 1)
            }
            break
        }
        continue
    }
    println(result.joinToString(""))
    return result
}