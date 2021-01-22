package problems.easy

fun main() {
    val defangingAnIPAddress = DefangingAnIPAddress()

    println(defangingAnIPAddress.defangIPaddr("1.1.1.1"))
    println(defangingAnIPAddress.defangIPaddr("255.100.50.0"))
}

class DefangingAnIPAddress {
    fun defangIPaddr(address: String): String {
        return address.replace(".", "[.]")
    }
}