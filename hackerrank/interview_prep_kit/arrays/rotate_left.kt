import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the rotLeft function below.
fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    var size: Int = a.size
    var rotatedArray = IntArray(size)
    var iterIndex = 0
    var rotateIndex = d

    while(rotateIndex < size) {
        rotatedArray[iterIndex] = a[rotateIndex]
        iterIndex++
        rotateIndex++
    }

    rotateIndex = 0;
    while(rotateIndex < d) {
        rotatedArray[iterIndex] = a[rotateIndex]
        iterIndex++
        rotateIndex++
    }
    return rotatedArray.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}
