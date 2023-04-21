import java.io.PrintWriter
import java.util.StringTokenizer
import kotlin.math.pow
import kotlin.math.sqrt

//private val INPUT = File("input.txt").inputStream()
//private val OUTPUT = File("output.txt").outputStream()
private val INPUT = System.`in`
private val OUTPUT = System.out

private val bufferedReader = INPUT.bufferedReader()
private val outputWriter = PrintWriter(OUTPUT, false)
private fun readLn() = bufferedReader.readLine()!!

private fun readList() = readLn().split(' ')
private var tokenizer = StringTokenizer("")
private fun read(): String {
    while (tokenizer.hasMoreTokens().not()) tokenizer = StringTokenizer(readLn(), " ")
    return tokenizer.nextToken()
}

private fun readInt() = read().toInt()
private fun readLong() = read().toLong()
private fun readDouble() = read().toDouble()

private fun readIntList() = readList().map { it.toInt() }
private fun readLongList() = readList().map { it.toLong() }
private fun readDoubleList() = readList().map { it.toDouble() }

private fun readIntArray(n: Int = 0) =
    if (n == 0) readList().run { IntArray(size) { get(it).toInt() } } else IntArray(n) { readInt() }

private fun readLongArray(n: Int = 0) =
    if (n == 0) readList().run { LongArray(size) { get(it).toLong() } } else LongArray(n) { readLong() }

private fun readDoubleArray(n: Int = 0) =
    if (n == 0) readList().run { DoubleArray(size) { get(it).toDouble() } } else DoubleArray(n) { readDouble() }


private fun Int.modPositive(other: Int): Int = if (this % other < 0) ((this % other) + other) else (this % other)


private class taskF {
    fun solveTestCase(): Any {
        //TODO: Solve the question
        val (a1, b1, a2, b2) = readIntArray()
        val combinations = listOf<IntArray>(
            intArrayOf(a1 + a2, maxOf(b1, b2)),
            intArrayOf(b1 + b2, maxOf(a1, a2)),
            intArrayOf(a1 + b2, maxOf(b1, a2)),
            intArrayOf((b1 + a2), maxOf(a1, b2))
        )
        val ans = combinations.minBy { it[0] * it[1] }

        return ans?.let { "${it[0]} ${it[1]}" } ?: ""


    }
}

fun main(args: Array<String>) {
    //TODO: Read in each Test Case

    outputWriter.println(
        taskF()
            .solveTestCase()
    )


    outputWriter.flush()
}