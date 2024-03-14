fun main() {
    //Predefined functions
    var y = Math.sqrt(144.0)
    println("The square root of 144.0 is $y")

    var x = Math.min(45,13)
    println("Minimum value is $x")




    var z = Math.max(45,13)
    println("Maximum value is $z")

    var e = Math.round(67.45)
   println(e)
    name()
   quotient(45,5)
    developers("Kamau",25)
    developers("Tatiana",18)
}

//User defined functions
fun name(){
    println("Aja")

}


fun quotient(num1:Int, num2:Int){
    println(num1/num2)

}
fun developers(name:String,age:Int){
    println("$name is $age years old")
}