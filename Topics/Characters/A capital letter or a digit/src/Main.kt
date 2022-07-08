fun main() {
    // write your code here
    val c = readln().first()
    println(c.isUpperCase() || c.isDigit() && c in '1'..'9')
}
