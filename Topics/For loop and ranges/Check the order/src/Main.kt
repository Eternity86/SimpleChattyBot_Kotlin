fun main() {
    // write your code here
    val n = readln().toInt()
    var prev = readln().toInt()
    var res = true
    for (i in 2..n) {
        val cur = readln().toInt()
        if (cur >= prev) {
            prev = cur
            continue
        } else {
            res = false
            break
        }
    }
    if (res) println("YES") else println("NO")
}