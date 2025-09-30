import kotlinx.coroutines.*


fun main(){

    //join only
    runBlocking {
       val child1 : Job= launch {//child 1 is a job
           println("Started Child 1")
           delay(2000)
           println("Finished child 1")
       } //first
       val child2:Job= launch {
           println("Started Child 2")
           delay(2000)
           println("Finished child 2")
       } //second

        joinAll(child1,child2)
        //The upcoming code won't perform until child1 & child2 finish
        launch {
            println("i've started")
        }//third

    }

    println()
    println()
    //join and cancel

    runBlocking {
       val child1 = launch {
            println("started1")
           delay(3000)
           println("Finished")
        }
        delay(1000)
        child1.cancelAndJoin()
        println("child1 canceled")
        launch {
            println("started2")

        }
    }


}
