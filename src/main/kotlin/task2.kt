import kotlinx.coroutines.*
fun main(){

    println("Enter value of N")
    val n = readln().toInt()

    GlobalScope.launch {
       val res =  async {
            fac(n)
        }

        println(res.await())
    }
    Thread.sleep(2000)
}
suspend fun fac(n:Int):Int{
     if(n==1){
         return 1
     }

    return  n * fac(n-1);
}