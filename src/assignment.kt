import java.util.Scanner
fun main() {
    val scores = Scanner(System.`in`)
    println("Student's score :")
    val Marks = scores.nextInt()
    val score = when(Marks){
        in 80..100 -> "A"
        in 60..79 -> "B"
        in 40..59 -> "C"
        in 20..39 -> "D"
        in 0..19 -> "E"
        else -> "Invalid Marks"
    }
    println("Grade :$score")
}