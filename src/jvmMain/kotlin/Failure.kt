import kotlinx.coroutines.delay

fun calcExpect(value: Int, increment: Int) {}

fun executeFunIntSuspendJvmUsage(){
    val a = CommonCodeInterface { v: Int, i: Int -> calcExpect(v, i) }
}