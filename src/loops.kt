import kotlin.math.abs

fun main() {
    //While loop
    var number = 20
    while (number <=25){
        println("Number is $number")
        number++
    }
    //Decrement
    var num = 106
    while (num >=100){
        println("Number is $num")
        num--
    }
 //Do while loop
    var z = 34
    do {
        println(z)
        z++
    }while (z <=40)

    //For loop
    var devices = arrayOf("laptop","phone","tablet")
    for (device in devices){
        println("Device is $device")
    }

    var marks = arrayOf(90,80,99)

    for (mark in marks){
        println("Marks is $mark")
    }

    for (mynumber in 50..60)
        println(mynumber)

    for (characters in 'a'..'d')
        println(characters)
}