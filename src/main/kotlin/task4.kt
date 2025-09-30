import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    val arr: IntArray = intArrayOf(1, 2, 3, 4, 5)

    runBlocking  {
        println("summation is ${summation(arr)}")
    }

}

suspend fun summation(arr: IntArray): Int {
    var sum = 0

    for (curr in arr) {
        sum += curr
    }
    return sum
}
//suspend functions can be called only inside another suspend function or in a courtines scope