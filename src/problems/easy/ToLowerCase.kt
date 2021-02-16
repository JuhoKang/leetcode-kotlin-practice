package problems.easy

fun main() {
    val toLowerCase = ToLowerCase()

    println(toLowerCase.toLowerCase("Hello"))
}

//lol
class ToLowerCase {
    fun toLowerCase(str: String): String {
        return str.toLowerCase()
    }
}