import java.lang.Math
fun Jarak(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double
): Double {
    val titik = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1)
    return Math.sqrt(titik)
}

fun main(args: Array<String>) {
    val x1 = 2.0
    val y1 = 3.0
    val x2 = 8.0
    val y2 = 7.0
    print(Jarak(x1, y1, x2, y2))
}
