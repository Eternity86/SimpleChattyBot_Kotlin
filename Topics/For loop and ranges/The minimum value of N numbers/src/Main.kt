fun main() {
    // write your code here
    val n = readln().toInt()
    var min = Int.MAX_VALUE
    for (i in 1..n) {
        val t = readln().toInt()
        if (t < min) min = t
    }
    println(min)
}