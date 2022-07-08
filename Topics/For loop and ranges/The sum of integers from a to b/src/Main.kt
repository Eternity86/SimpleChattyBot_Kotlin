fun main() {
    // put your code here
    var sum = 0
    for (i in readln().toInt()..readln().toInt()) {
        sum += i
    }
    println(sum)
}