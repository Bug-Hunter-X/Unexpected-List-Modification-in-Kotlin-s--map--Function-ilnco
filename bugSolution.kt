fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(list) // Original list remains unchanged
    println(result) // New list with the mapped values
}