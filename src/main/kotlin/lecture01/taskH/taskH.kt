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


private class taskH {
    fun solveTestCase(): String {
        //TODO: Solve the question

        val intervalA = readInt()
        val intervalB = readInt()
        val trainsA = readInt()
        val trainsB = readInt()

        val minA = (trainsA - 1) * (intervalA + 1) + 1
        val minB = (trainsB - 1) * (intervalB + 1) + 1
        val maxA = (trainsA - 1) * (intervalA + 1) + 1 + 2 * intervalA
        val maxB = (trainsB - 1) * (intervalB + 1) + 1 + 2 * intervalB

        val ans1 = maxOf(minA, minB)
        val ans2 = minOf(maxA, maxB)
        if (ans2 < ans1)
            return "-1"
        else

            return "${ans1} ${ans2}"

    }
}

fun main(args: Array<String>) {

    //TODO: Read in each Test Case

    outputWriter.println(
        taskH()
            .solveTestCase()
    )


    outputWriter.flush()
}