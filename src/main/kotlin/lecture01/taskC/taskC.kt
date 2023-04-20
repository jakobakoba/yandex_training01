import java.io.PrintWriter
import java.lang.StringBuilder
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


private class taskC {
    fun solveTestCase(): String {
        val vasyaPhone = readLn()
        val phoneBook = listOf<String>(readLn(), readLn(), readLn())

        val results = phone(vasyaPhone, phoneBook)
        val sb = StringBuilder()
        sb.appendLine(results[0])
        sb.appendLine(results[1])
        sb.appendLine(results[2])
        return sb.toString()
    }

    private fun parsePhone(phone: String): Any {
        val digits = phone.filter { it.isDigit() }
        return if (digits.length == 7) {
            Pair(DEFAULT_CODE, digits)
        } else
            Pair(digits.substring(1, 4), digits.substring(4))
    }

    private fun phone(vasyaPhone: String, phoneBook: List<String>): List<String> {
        val vasyaParsedPhone = parsePhone(vasyaPhone)
        return phoneBook.map {
            if (parsePhone(it) == vasyaParsedPhone) {
                "YES"
            } else
                "NO"
        }
    }
}

fun main(args: Array<String>) {

    //TODO: Read in each Test Case
    outputWriter.println(
        taskC()
            .solveTestCase()
    )
    outputWriter.flush()
}

const val DEFAULT_CODE = "495"