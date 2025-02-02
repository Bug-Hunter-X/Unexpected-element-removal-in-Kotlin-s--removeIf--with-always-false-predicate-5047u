fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val copyList = list.toMutableList()
    copyList.removeIf { it > 5 } // Correct usage. Predicate does not modify original list.
    println(list) // Output: [1, 2, 3, 4, 5]
    println(copyList)// Output: [1, 2, 3, 4, 5]
}