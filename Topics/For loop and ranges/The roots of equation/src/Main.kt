const val LOWER = 0
const val UPPER = 1000

fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    for (i in LOWER..UPPER) {
        if (a * i * i * i + b * i * i + c * i + d == 0) println(i)
    }
}