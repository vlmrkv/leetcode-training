fun main() {
    // Given an integer n, return a string array answer (1-indexed) where:
    //
    // answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    // answer[i] == "Fizz" if i is divisible by 3.
    // answer[i] == "Buzz" if i is divisible by 5.
    // answer[i] == i (as a string) if none of the above conditions are true.
    var n = 15
    answer(n)
}

fun answer(n: Int): List<String> {
    var answer = mutableListOf<String>()
    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) {
            answer.add("FizzBuzz")
        } else if (i % 3 == 0) {
            answer.add("Fizz")
        } else if (i % 5 == 0) {
            answer.add("Buzz")
        } else {
            answer.add(i.toString())
        }
    }
    println(answer)
    return answer
}