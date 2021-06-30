import kotlinx.coroutines.delay

fun interface CommonCodeInterface {

    fun calculate(value: Int, increment: Int)

    suspend fun implementedCalc(){
        delay(1200)
        println("Calculated in implementedCalc: ${42}")
    }
}

