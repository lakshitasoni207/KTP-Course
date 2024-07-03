import com.faangx.ktp.patterns.single.PatternLinesAndCharBasedMiniApp

fun printPattern(lines: Int, char: Char) {
    println("*")
    println("**")
    println("***")
    println("****")
    println("*****")

}



fun main() {
    PatternLinesAndCharBasedMiniApp("BL", ::printPattern)
}