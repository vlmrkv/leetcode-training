fun main() {
    // Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    // Return the running sum of nums.
    var num = intArrayOf(1, 2, 3, 4)
    runningSum(num)
}

fun runningSum(nums: IntArray): IntArray {
    var res = IntArray(nums.size)
    res[0] = nums[0]
    for (i in 1 until nums.size) {
        res[i] = nums[i] + res[i - 1]
    }
    println(res.joinToString())
    return res
}