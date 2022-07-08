fun main() {
    // put your code here
    var mul = 1L
    for (i in readln().toInt() until readln().toInt()) {
        mul *= i
    }
    println(mul)
}