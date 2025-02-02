fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]
    // the expected output is [1,2,3,4,5] because the removeIf condition is always false
}