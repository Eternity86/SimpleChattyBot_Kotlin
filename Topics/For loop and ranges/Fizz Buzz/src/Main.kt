fun main() {
    // write your code here
    for (i in readln().toInt()..readln().toInt()) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
            continue
        }
        if (i % 3 == 0) {
            println("Fizz")
            continue
        }
        if (i % 5 == 0) {
            println("Buzz")
            continue
        }
        println(i)
    }
}