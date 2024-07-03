import com.faangx.ktp.patterns.single.PatternLinesBasedMiniApp

fun printPattern(lines: Int) {
    repeat(lines) { i ->
        repeat(i) { print(' ') }
        for (x in lines downTo i+4) { print(x)}
        println()
    }
}

fun main() {
    PatternLinesBasedMiniApp("TRSR", ::printPattern)
}