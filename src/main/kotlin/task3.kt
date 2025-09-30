import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    val job = GlobalScope.launch {
        launch {
            println("First")
            delay(20000)
            println("Finished 1")//This won't be printed due to the cancel of the parent job
        }
        launch {
            println("Second")
            delay(20000)
            println("Finished 2 ") //This also won't be printed due to the cancel of the parent job
        }


    }
    Thread.sleep(10000)

    job.cancel()
    println("Both coroutines are canceled") //canceled after 10 seconds

}
