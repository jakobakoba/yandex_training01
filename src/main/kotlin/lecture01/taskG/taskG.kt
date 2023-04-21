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


private class taskG {
    fun solveTestCase(): Any {
        //TODO: Solve the question
        var (n, k, m) = readIntArray()
        val details_per_bar = (k / m).toInt()
        if (details_per_bar == 0)
            return 0
        val weight_for_one_bar = details_per_bar * m

        var details = 0
        while (n >= k) {
            var bars = (n / k).toInt()
            details += bars * details_per_bar
            n -= bars * weight_for_one_bar


        }
        return details
    }
}

fun main(args: Array<String>) {
    //TODO: Read in each Test Case

    outputWriter.println(
        taskG()
            .solveTestCase()
    )


    outputWriter.flush()
}