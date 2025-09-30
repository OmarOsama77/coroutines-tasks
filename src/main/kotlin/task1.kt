import kotlinx.coroutines.*
fun main(){
    GlobalScope.launch {
        async {
            for (i in 1..10){
                println(i)
                delay(1000)
            }
        }
    }
    Thread.sleep(10000)
}